package setsAndMapsAdvanced.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phone = tokens[1];

            phonebook.put(name, phone);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")) {

            if (!phonebook.containsKey(input)) {
                System.out.printf("Contact %s does not exist.%n", input);
            } else {
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            }

            input = scanner.nextLine();
        }
    }
}
