package generics.exercises.ex04GenericSwapMethodInteger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Integer> box = new Box<>();

        while (n-- > 0) {

            int element = Integer.parseInt(scanner.nextLine());

            box.add(element);
        }

        int[] command = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstIndex = command[0];
        int secondIndex = command[1];

        box.swap(firstIndex, secondIndex);

        System.out.println(box);
    }
}
