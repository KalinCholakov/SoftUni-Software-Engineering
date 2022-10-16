package iteratorsAndComparators.exercises.ex03StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StackIterator stack = new StackIterator();

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String command = input.split("\\s+")[0];

            if (command.equals("Push")) {
                int[] numbersToPush = Arrays.stream(input.substring(5).trim().split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                stack.push(numbersToPush);
            } else if (command.equals("Pop")) {
                stack.pop();
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            for (int element : stack) {
                System.out.println(element);
            }
        }
    }
}
