package functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03CustomMinFunctionVar3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        //Function<int[], Integer> function = elements -> Arrays.stream(elements).min().orElseThrow(() -> new IllegalArgumentException());
        Function<int[], Integer> function = elements -> Collections.min(Arrays.stream(elements).boxed().collect(Collectors.toList()));

        int min = function.apply(numbers);

        System.out.println(min);
    }
}
