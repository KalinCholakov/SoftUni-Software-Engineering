package polymorphism.exercises.ex03WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    protected DecimalFormat getDecimalFormat() {
        return decimalFormat;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getAnimalType())
                .append("[")
                .append(getAnimalName())
                .append(", ")
                .append(decimalFormat.format(getAnimalWeight()))
                .append(", ")
                .append(getLivingRegion())
                .append(", ")
                .append(getFoodEaten())
                .append("]");

        return stringBuilder.toString();
    }
}
