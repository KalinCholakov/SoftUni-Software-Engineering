package polymorphism.exercises.ex01Vehicles;

public class Truck extends Vehicle {

    public static final double SUMMER_OVER_CONSUMPTION = 1.6;
    public static final double FUEL_AFTER_DRIVER_DEDUCTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_OVER_CONSUMPTION);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * FUEL_AFTER_DRIVER_DEDUCTION);
    }
}
