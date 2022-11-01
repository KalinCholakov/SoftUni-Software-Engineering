package encapsulation.exercises.ex03ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peopleData = scanner.nextLine().split(";");

        Map<String, Person> peopleMap = new LinkedHashMap<>();

        for (String peopleDatum : peopleData) {
            String[] tokens = peopleDatum.split("=");

            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);

            try {
                Person person = new Person(name, money);
                peopleMap.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] productData = scanner.nextLine().split(";");

        Map<String, Product> productMap = new LinkedHashMap<>();

        for (String productDatum : productData) {
            String[] tokens = productDatum.split("=");

            String name = tokens[0];
            double cost = Double.parseDouble(tokens[1]);

            try {
                Product product = new Product(name, cost);
                productMap.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            String[] tokens = command.split("\\s+");

            String personName = tokens[0];
            String productName = tokens[1];

            Person buyer = peopleMap.get(personName);
            Product product = productMap.get(productName);

            try {
                buyer.buyProduct(product);

                System.out.printf("%s bought %s%n", personName, productName);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        peopleMap.values().forEach(System.out::println);
    }
}
