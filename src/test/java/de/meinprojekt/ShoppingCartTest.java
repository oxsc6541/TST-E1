package de.meinprojekt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void neuerWarenkorbHatSummeNull() {
        // Das wird sofort rot unterringelt, weil es die Klasse noch nicht gibt!
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotal());
    }
}
