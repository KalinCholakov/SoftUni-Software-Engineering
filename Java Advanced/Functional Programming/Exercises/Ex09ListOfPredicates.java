package functionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endOfRange = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersToDivideTo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Predicate<Integer> isDivisible = number -> {
            for (Integer numbers : numbersToDivideTo) {
                if (number % numbers != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int number = 1; number <= endOfRange; number++) {
            if (isDivisible.test(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
