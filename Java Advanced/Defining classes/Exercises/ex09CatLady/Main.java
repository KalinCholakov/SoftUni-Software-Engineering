package definingClasses.exercises.ex09CatLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Cat> cats = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] data = input.split("\\s+");

            String name = data[1];
            double specialParameter = Double.parseDouble(data[2]);

            Cat cat = null;

            if (input.contains("Siamese")) {
                cat = new Siamese(name, specialParameter);
            } else if (input.contains("Cymric")) {
                cat = new Cymric(name, specialParameter);
            } else if (input.contains("StreetExtraordinaire")) {
                cat = new StreetExtraordinaire(name, specialParameter);
            }

            cats.put(name, cat);

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();

        System.out.println(cats.get(name).toString());
    }
}
