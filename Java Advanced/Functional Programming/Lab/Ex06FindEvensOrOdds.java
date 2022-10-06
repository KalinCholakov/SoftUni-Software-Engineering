package functionalProgramming.lab;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");

        int begin = Integer.parseInt(data[0]);
        int end = Integer.parseInt(data[1]);

        String filter = scanner.nextLine();

        IntPredicate predicate = n -> filter.equals("odd") == (n % 2 != 0);

        String output = IntStream.rangeClosed(begin, end)
                .filter(predicate)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
