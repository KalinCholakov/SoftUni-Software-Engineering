package ListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> namesList = new ArrayList<>();

        while (countCommands > 0) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];

            if (input.contains("not")) {
                if (namesList.contains(name)) {
                    namesList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            } else {
                if (namesList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    namesList.add(name);
                }
            }
            countCommands--;
        }

        for (String names : namesList) {
            System.out.println(names);
        }
    }
}
