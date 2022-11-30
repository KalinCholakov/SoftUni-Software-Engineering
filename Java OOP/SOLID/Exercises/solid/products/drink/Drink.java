package solid.products.drink;

import solid.products.Product;

public abstract class Drink implements Product {

    private double milliliters;
    private double caloriesPer100Grams;
    private double density;

    public Drink(double milliliters, double caloriesPer100Grams, double density) {
        setMilliliters(milliliters);
        setCaloriesPer100Grams(caloriesPer100Grams);
        setDensity(density);
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }

    public void setCaloriesPer100Grams(double caloriesPer100Grams) {
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public double getCalories() {
        double grams = milliliters * density;
        return (caloriesPer100Grams / 100) * grams;
    }

    public double getLiters() {
        return milliliters / 1000;
    }

    @Override
    public double getKilograms() {
        return getLiters() * density;
    }
}
