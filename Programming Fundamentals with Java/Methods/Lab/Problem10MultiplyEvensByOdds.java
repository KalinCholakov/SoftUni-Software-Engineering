package Methods;

import java.util.Scanner;

public class Problem10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultiplyOfEvenAndOdds(number));
    }

    public static int getMultiplyOfEvenAndOdds(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        return evenSum * oddSum;
    }

    public static int getEvenSum(int number) {
        int evenSum = 0;
        while (number > 0) {
            int temp = number % 10;
            if (temp % 2 == 0) {
                evenSum += temp;
            }
            number /= 10;
        }
        return evenSum;
    }

    public static int getOddSum(int number) {
        int oddSum = 0;
        while (number > 0) {
            int temp = number % 10;
            if (temp % 2 != 0) {
                oddSum += temp;
            }
            number /= 10;
        }
        return oddSum;
    }
}
