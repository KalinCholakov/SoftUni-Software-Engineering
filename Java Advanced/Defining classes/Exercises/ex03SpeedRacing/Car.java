package definingClasses.exercises.ex03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCons;
    private int distanceTravelled;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCons = fuelCost;
        this.distanceTravelled = 0;
    }

    public String getModel() {
        return model;
    }

    public double getFuelCons() {
        return fuelCons;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distanceTravelled);
    }

    public double calculateRequiredFuel(int distance) {
        return this.getFuelCons() * distance;
    }

    public boolean hasEnoughFuel(int distance) {
        return fuelAmount >= calculateRequiredFuel(distance);
    }

    public void drive(int distance) {
        if (hasEnoughFuel(distance)) {
            this.fuelAmount -= calculateRequiredFuel(distance);
            this.distanceTravelled += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }
}
