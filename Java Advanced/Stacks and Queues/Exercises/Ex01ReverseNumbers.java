package stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex01ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<String> stack = new ArrayDeque<>();

        Arrays.stream(input.split("\\s+"))
                .forEach(stack::push);

        while (!stack.isEmpty()) {
            System.out.print(stack.poll() + " ");
        }
    }
}
