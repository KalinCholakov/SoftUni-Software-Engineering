package functionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex09ListOfPredicatesVar2 {
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

        IntStream.rangeClosed(1, endOfRange).boxed()
                .filter(isDivisible)
                .forEach(number -> System.out.print(number + " "));
    }
}
