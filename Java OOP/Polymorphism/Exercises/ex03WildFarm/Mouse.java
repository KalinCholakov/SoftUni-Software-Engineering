package polymorphism.exercises.ex03WildFarm;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eatFood(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Mouses are not eating that type of food!");
        }
    }
}
