package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] parts = command.split(" ");

            switch (parts[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(parts[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(parts[2]) < 0 || Integer.parseInt(parts[2]) >= numbers.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    numbers.add(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]));
                    break;
                case "Remove":
                    if (Integer.parseInt(parts[1]) < 0 || Integer.parseInt(parts[1]) >= numbers.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    numbers.remove(Integer.parseInt(parts[1]));
                    break;
                case "Shift":
                    if (parts[1].equals("left")) {
                        for (int i = 1; i <= Integer.parseInt(parts[2]); i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else if (parts[1].equals("right")) {
                        for (int i = 1; i <= Integer.parseInt(parts[2]); i++) {
                            int lastNum = numbers.get(numbers.size() - 1);
                            numbers.add(0, lastNum);
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
