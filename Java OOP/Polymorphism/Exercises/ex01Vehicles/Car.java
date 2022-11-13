package polymorphism.exercises.ex01Vehicles;

public class Car extends Vehicle {

    public static final double SUMMER_OVER_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_OVER_CONSUMPTION);
    }
}
