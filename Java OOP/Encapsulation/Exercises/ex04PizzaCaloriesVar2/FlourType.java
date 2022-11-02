package encapsulation.exercises.ex04PizzaCaloriesVar2;

public enum FlourType {
    White(1.5),
    Wholegrain(1.0);

    private final double modifier;

    FlourType(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
