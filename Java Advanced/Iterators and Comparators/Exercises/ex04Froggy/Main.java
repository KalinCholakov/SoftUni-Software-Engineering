package iteratorsAndComparators.exercises.ex04Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] input = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Lake lake = new Lake(input);

        String command = scanner.nextLine();

        List<String> output = new ArrayList<>();

        if (command.equals("END")) {
            for (Integer integer : lake) {
                output.add(String.valueOf(integer));
            }
        }

        System.out.println(String.join(", ", output));
    }
}
