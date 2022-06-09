package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCommands = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        String[] elements = line.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            numbers.add(Integer.parseInt(elements[i]));
        }

        int position = 0;
        int countCommand = 1;
        while (countCommand <= numberCommands) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");

            switch (parts[0]) {
                case "Forward":
                    int forward = Integer.parseInt(parts[1]);
                    numbers.subList(forward, forward).clear();
                    position += forward;
                    break;
                case "Back":
                    int back = Integer.parseInt(parts[1]);
                    numbers.subList(back, back).clear();
                    position -= back;
                    break;
                case "Gift":
                    int index = Integer.parseInt(parts[1]);
                    int houseNumber = Integer.parseInt(parts[2]);
                    numbers.set(index, numbers.get(houseNumber));
                    position = index;
                    break;
                case "Swap":
                    int temp = 0;
                    int indexOfFirst = Integer.parseInt(parts[1]);
                    int indexOfSecond = Integer.parseInt(parts[2]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == indexOfFirst) {
                            temp = numbers.get(i);
                            numbers.set(i, numbers.get(indexOfSecond));
                        }
                        if (numbers.get(i) == indexOfSecond) {
                            numbers.set(i, temp);
                        }
                    }
                    break;
            }
            countCommand++;
        }
        System.out.printf("Position: %d%n", position);
        for (int i = position; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d", i);
            }
        }
    }
}