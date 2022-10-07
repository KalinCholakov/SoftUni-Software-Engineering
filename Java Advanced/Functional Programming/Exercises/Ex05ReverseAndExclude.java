package functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(list);

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> predicate = number -> number % n == 0;

        list.removeIf(predicate);

        list.forEach(e -> System.out.print(e + " "));
    }
}
