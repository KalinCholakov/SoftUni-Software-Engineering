package exceptionsAndErrorHandling.ex01NumberInRange;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.printf("Range: [%d...%d]%n", range[0], range[1]);

        boolean isValidInput = false;

        while (!isValidInput) {
            String nextInput = scanner.nextLine();

            Optional<Integer> number = Optional.empty();

            try {
                number = Optional.of(Integer.parseInt(nextInput));
            } catch (NumberFormatException ignored) {
            }

            String output = "Invalid number: " + nextInput;

            if (number.isPresent() && isInRange(range, number.get())) {
                output = "Valid number: " + number.get();
                isValidInput = true;
            }

            System.out.println(output);
        }
    }

    private static boolean isInRange(int[] range, int number) {
        return number >= range[0] && number <= range[1];
    }
}
