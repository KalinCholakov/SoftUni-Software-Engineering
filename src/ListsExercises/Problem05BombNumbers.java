package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String[] bombNumbersPowers = scanner.nextLine().split("\\s+");

        String bombNumber = bombNumbersPowers[0];
        int bombPower = Integer.parseInt(bombNumbersPowers[1]);

        while (numbers.contains(bombNumber)) {
            int bombIndex = numbers.indexOf(bombNumber);

            int left = Math.max(0, bombIndex - bombPower);
            int right = Math.min(bombIndex + bombPower, numbers.size() - 1);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }

        System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());
    }
}
