package polymorphism.exercises.ex03WildFarm;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eatFood(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getAnimalType())
                .append("[")
                .append(getAnimalName())
                .append(", ")
                .append(getBreed())
                .append(", ")
                .append(getDecimalFormat().format(getAnimalWeight()))
                .append(", ")
                .append(getLivingRegion())
                .append(", ")
                .append(getFoodEaten())
                .append("]");

        return stringBuilder.toString();
    }
}
