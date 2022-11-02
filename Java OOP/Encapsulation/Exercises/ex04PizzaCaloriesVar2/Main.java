package encapsulation.exercises.ex04PizzaCaloriesVar2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split("\\s+");

        String name = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);

        String[] doughData = scanner.nextLine().split("\\s+");

        try {
            Pizza pizza = new Pizza(name, numberOfToppings);
            Dough dough = new Dough(doughData[1], doughData[2], Double.parseDouble(doughData[3]));

            pizza.setDough(dough);

            String toppings = scanner.nextLine();
            while (!"END".equals(toppings)) {
                String[] toppingData = toppings.split("\\s+");

                Topping topping = new Topping(toppingData[1], Double.parseDouble(toppingData[2]));

                pizza.addTopping(topping);

                toppings = scanner.nextLine();
            }

            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
