package stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tokens = scanner.nextLine();
        int countPushElements = Integer.parseInt(tokens.split("\\s+")[0]);
        int countPopElements = Integer.parseInt(tokens.split("\\s+")[1]);
        int presentElement = Integer.parseInt(tokens.split("\\s+")[2]);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] numbers = scanner.nextLine().split(" ");
        int count = 0;

        while (count < countPushElements) {
            stack.push(Integer.parseInt(numbers[count]));
            count++;
        }

        while (countPopElements > 0) {
            stack.pop();
            countPopElements--;
        }

        if (stack.contains(presentElement)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println("0");
            } else {
                int minElement = stack.stream().mapToInt(e -> e).min().getAsInt();
                System.out.println(minElement);
            }
        }
    }
}
