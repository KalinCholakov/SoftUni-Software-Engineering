package definingClasses.exercises.ex07Google;

public class Car {
    private String model;
    private String speed;

    public Car(String model, String speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("%s %s", model, speed);
    }
}
