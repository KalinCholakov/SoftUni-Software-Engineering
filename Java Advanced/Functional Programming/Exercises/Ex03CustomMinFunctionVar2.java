package functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Ex03CustomMinFunctionVar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> function = e -> {
            int min = Integer.MAX_VALUE;
            for (int i : e) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        };

        int min = function.apply(numbers);

        System.out.println(min);
    }
}
