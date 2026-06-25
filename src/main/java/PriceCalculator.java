package de.meinprojekt;

public class PriceCalculator {

    private final DiscountService discountService;

    // Hier wird der Service übergeben (Dependency Injection)
    public PriceCalculator(DiscountService discountService) {
        this.discountService = discountService;
    }

    public double calculateFinalPrice(double basePrice, String customerType) {
        // Holt den Rabatt von der externen Quelle
        double discount = discountService.getDiscountPercentage(customerType);

        // Kleine Absicherung gegen korrupte API-Daten
        if (discount < 0 || discount > 100) {
            throw new IllegalStateException("Ungültiger Rabattwert von der API");
        }

        return basePrice * (1 - (discount / 100.0));
    }
}
