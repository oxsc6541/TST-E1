package de.meinprojekt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@org.mockito.junit.jupiter.MockitoSettings(strictness = org.mockito.quality.Strictness.LENIENT)

@ExtendWith(MockitoExtension.class) // Aktiviert Mockito für JUnit 5
class PriceCalculatorTest {

    @Mock
    private DiscountService discountServiceMock; // Erstellt die API-Attrappe

    @InjectMocks
    private PriceCalculator priceCalculator; // Setzt den Mock automatisch hier ein

    @Test
    void berechnetEndpreisMitRabatt() {
        // Verhalten vorgeben (Stubbing): Wenn "VIP" gefragt wird, simuliere 20% Rabatt
        when(discountServiceMock.getDiscountPercentage("VIP")).thenReturn(20.0);

        double endpreis = priceCalculator.calculateFinalPrice(100.0, "VIP");

        // Überprüfen, ob das mathematische Ergebnis stimmt
        assertEquals(80.0, endpreis);

        // Verifizieren, ob die Methode auf dem Mock auch wirklich genau einmal aufgerufen wurde
        verify(discountServiceMock, times(1)).getDiscountPercentage("VIP");
    }

    @Test
    void wirftExceptionBeiUngueltigemApiRabatt() {
        // Wir simulieren einen API-Fehler (110% Rabatt ist unmöglich)
        when(discountServiceMock.getDiscountPercentage("PREMIUM")).thenReturn(110.0);

        // Prüfen, ob unsere Absicherung die erwartete Exception wirft
        assertThrows(IllegalStateException.class, () -> {
            priceCalculator.calculateFinalPrice(100.0, "PREMIUM");
        });
    }
}
