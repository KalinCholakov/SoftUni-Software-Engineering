package stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Ex04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        int countNumbers = Integer.parseInt(input[0]);
        int elementsToRemove = Integer.parseInt(input[1]);
        int presentElement = Integer.parseInt(input[2]);
        String[] numbers = scanner.nextLine().split("\\s+");

        for (int i = 0; i < countNumbers; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < elementsToRemove; i++) {
            queue.poll();
        }

        if (queue.contains(presentElement)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
