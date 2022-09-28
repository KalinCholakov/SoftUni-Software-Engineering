package setsAndMapsAdvanced.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Double>> foodShops = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")) {

            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            Double price = Double.parseDouble(tokens[2]);

            foodShops.putIfAbsent(shop, new LinkedHashMap<>());

            Map<String, Double> products = foodShops.get(shop);

            products.putIfAbsent(product, price);

            input = scanner.nextLine();
        }

        foodShops.entrySet().stream()
                .forEach(e -> {
                    System.out.printf("%s->%n", e.getKey());
                    e.getValue().entrySet().stream()
                            .forEach(inner -> {
                                System.out.printf("Product: %s, ", inner.getKey());
                                System.out.printf("Price: %.1f%n", inner.getValue());
                            });

                });
    }
}
