package setsAndMapsAdvanced.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")) {
                emailMap.put(input, email);
            }

            input = scanner.nextLine();
        }

        emailMap.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
