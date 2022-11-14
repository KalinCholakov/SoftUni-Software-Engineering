package polymorphism.exercises.ex03WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        List<Food> foods = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] animalData = input.split("\\s+");
            String animalType = animalData[0];
            String animalName = animalData[1];
            Double animalWeigh = Double.parseDouble(animalData[2]);
            String animalLivingRegion = animalData[3];

            switch (animalType) {
                case "Mouse":
                    Animal mouse = new Mouse(animalName, animalType, animalWeigh, animalLivingRegion);
                    animals.add(mouse);
                    break;
                case "Zebra":
                    Animal zebra = new Zebra(animalName, animalType, animalWeigh, animalLivingRegion);
                    animals.add(zebra);
                    break;
                case "Tiger":
                    Animal tiger = new Tiger(animalName, animalType, animalWeigh, animalLivingRegion);
                    animals.add(tiger);
                    break;
                case "Cat":
                    String catBreed = animalData[4];
                    Animal cat = new Cat(animalName, animalType, animalWeigh, animalLivingRegion, catBreed);
                    animals.add(cat);
                    break;
            }

            String[] foodData = scanner.nextLine().split("\\s+");
            String foodType = foodData[0];
            Integer quantity = Integer.parseInt(foodData[1]);

            switch (foodType) {
                case "Vegetable":
                    Food vegetable = new Vegetable(quantity);
                    foods.add(vegetable);
                    break;
                case "Meat":
                    Food meat = new Meat(quantity);
                    foods.add(meat);
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            Food food = foods.get(i);

            animal.makeSound();
            animal.eatFood(food);

            System.out.println(animal);
        }
    }
}
