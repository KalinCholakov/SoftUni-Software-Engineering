package stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Ex03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countCommands; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];

            switch (command) {
                case "1":
                    stack.push(Integer.parseInt(tokens[1]));
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case "3":
                    int maxElement = stack.stream()
                            .mapToInt(e -> e)
                            .max()
                            .getAsInt();
                    System.out.println(maxElement);

                    //System.out.println(Collections.max(stack));
            }
        }
    }
}
