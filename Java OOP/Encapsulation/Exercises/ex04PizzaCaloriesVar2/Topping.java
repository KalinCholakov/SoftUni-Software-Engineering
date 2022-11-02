package encapsulation.exercises.ex04PizzaCaloriesVar2;

import java.util.Arrays;

public class Topping {
    private ToppingType toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        boolean toppingTypeDoesNotExist = Arrays.stream(ToppingType.values())
                .noneMatch(toppingType1 -> toppingType1.name().equals(toppingType));

        if (toppingTypeDoesNotExist) {
            throw new IllegalArgumentException(String.format
                    ("Cannot place %s on top of your pizza.", toppingType));
        }

        this.toppingType = ToppingType.valueOf(toppingType);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format
                    ("%s weight should be in the range [1..50].", toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * weight * toppingType.getModifier();
    }
}
