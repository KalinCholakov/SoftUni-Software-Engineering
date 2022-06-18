package MethodsExercise;

import java.util.Scanner;

public class Problem10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isSumOfDigitsIsDivisibleBy8(i) && isHoldAtLeastOneOddDigit(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isSumOfDigitsIsDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum % 8 == 0;
    }

    public static boolean isHoldAtLeastOneOddDigit(int number) {
        int countOdd = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                countOdd++;
            }
            number /= 10;
        }

        return countOdd >= 1;
    }
}
