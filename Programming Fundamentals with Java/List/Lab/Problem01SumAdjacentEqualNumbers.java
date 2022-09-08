package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        String output = joinElementsByDelimiter(numbers);
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> items) {
        StringBuilder output = new StringBuilder();
        for (Double item : items)
            output.append(new DecimalFormat("0.#").format(item)).append(" ");
        return output.toString();
    }
}
