package workingWithAbstraction.lab.ex04HotelReservation;

public class PriceCalculator {

    public static double calculateTotalPrice(
            double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {

        double priceForAllDays = pricePerDay * numberOfDays * season.getFactor();
        priceForAllDays = priceForAllDays - priceForAllDays * (discountType.getPercent() / 100);

        return priceForAllDays;
    }
}
