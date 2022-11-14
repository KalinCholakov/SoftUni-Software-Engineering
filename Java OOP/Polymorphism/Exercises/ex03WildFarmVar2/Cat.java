package polymorphism.exercises.ex03WildFarmVar2;

public class Cat extends Feline {
    private final String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        StringBuilder baseToString = new StringBuilder(super.toString());
        baseToString.insert(baseToString.indexOf(",") + 1, " " + this.breed + ",");

        return baseToString.toString();
    }
}
