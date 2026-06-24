package de.meinprojekt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void neuerWarenkorbHatSummeNull() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotal());
    }

    @Test
    void produktKannHinzugefuegtWerden() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apfel", 2.0, 2);

        assertEquals(4.0, cart.getTotal());
    }
}
