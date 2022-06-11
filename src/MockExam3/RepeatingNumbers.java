package MockExam3;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
            if (n == 1) {
                System.out.println(numbers[i]);
                return;
            }
        }

        Arrays.sort(numbers);
        int length = 1;
        int maxLength = 0;
        int currentDuplicated = 0;
        int minDuplicated = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                length++;
                currentDuplicated = numbers[i];
            } else {
                length = 1;
            }
            if (length > maxLength) {
                maxLength = length;
                minDuplicated = currentDuplicated;
            }
        }
        System.out.println(minDuplicated);
    }
}
