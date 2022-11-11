package interfacesAndAbstraction.exercises.ex03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] data = input.split("\\s+");
            String type = data[0];

            switch (type) {
                case "Citizen":
                    Citizen citizen = new Citizen(data[1], Integer.parseInt(data[2]), data[3], data[4]);
                    birthables.add(citizen);
                    break;
                case "Robot":
                    Robot robot = new Robot(data[1], data[2]);
                    break;
                case "Pet":
                    Pet pet = new Pet(data[1], data[2]);
                    birthables.add(pet);
                    break;
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        boolean isFound = false;
        for (Birthable birthable : birthables) {

            if (birthable.getBirthDate().endsWith(year)) {
                System.out.println(birthable.getBirthDate());
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("<no output>");
        }
    }
}
