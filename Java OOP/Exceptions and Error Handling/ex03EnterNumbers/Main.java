package exceptionsAndErrorHandling.ex03EnterNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;

        List<Integer> allInRange = new ArrayList<>();

        while (allInRange.size() < 10) {

            try {
                start = readNumber(start, end, scanner);
                allInRange.add(start);
            } catch (NumberFormatException ignored) {
                System.out.println("Invalid Number!");
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(allInRange.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }

    public static int readNumber(int start, int end, Scanner scanner) {
        int number = Integer.parseInt(scanner.nextLine());

        if (start >= number || number >= end) {
            throw new IllegalStateException(String.format("Your number is not in range %d - 100!", start));
        }

        return number;
    }
}
