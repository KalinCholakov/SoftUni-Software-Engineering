package encapsulation.exercises.ex04PizzaCaloriesVar2;

import java.util.Arrays;

public class Dough {
    private FlourType flourType;
    private BakingTechnique bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        boolean flourTypeDoesNotExist = Arrays.stream(FlourType.values())
                .noneMatch(flourType1 -> flourType1.name().equals(flourType));

        if (flourTypeDoesNotExist) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.flourType = FlourType.valueOf(flourType);
    }

    private void setBakingTechnique(String bakingTechnique) {
        boolean bakingTechniqueDoesNotExist = Arrays.stream(BakingTechnique.values())
                .noneMatch(bakingTechnique1 -> bakingTechnique1.name().equals(bakingTechnique));

        if (bakingTechniqueDoesNotExist) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingTechnique = BakingTechnique.valueOf(bakingTechnique);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * weight * flourType.getModifier() * bakingTechnique.getModifier();
    }
}
