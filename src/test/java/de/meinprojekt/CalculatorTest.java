package de.meinprojekt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addiertZweiZahlen() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void dividiertZweiZahlen() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    void wirftExceptionBeiDivisionDurchNull() {
        Calculator calculator = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
