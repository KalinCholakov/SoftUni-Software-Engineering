package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "Add":
                    int numberAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberAdd);
                    break;
                case "Remove":
                    int numberRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(numberRemove));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(indexRemove);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(commandParts[1]);
                    int indexInsert = Integer.parseInt(commandParts[2]);
                    numbers.add(indexInsert, numberInsert);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
