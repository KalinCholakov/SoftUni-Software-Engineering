package setsAndMapsAdvanced.lab;

import java.util.*;

public class Ex07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());

            Map<String, List<String>> countries = continents.get(continent);

            countries.putIfAbsent(country, new ArrayList<>());

            List<String> cities = countries.get(country);

            cities.add(city);
        }

        continents.entrySet().stream()
                .forEach(e -> {
                    System.out.printf("%s:%n", e.getKey());
                    e.getValue().entrySet().stream()
                            .forEach(c -> {
                                String cities = String.join(", ", c.getValue());
                                System.out.printf("%s -> %s%n", c.getKey(), cities);
                            });
                });
    }
}
