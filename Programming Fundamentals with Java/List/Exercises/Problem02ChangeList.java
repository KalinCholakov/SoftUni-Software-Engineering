package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String commandName = command.split(" ")[0];
            int element = Integer.parseInt(command.split(" ")[1]);

            if (commandName.equals("Delete")) {
                numbers.removeAll(List.of(element));
            } else if (commandName.equals("Insert")) {
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }
            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
