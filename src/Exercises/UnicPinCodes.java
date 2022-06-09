package Exercises;

import java.util.Scanner;

public class UnicPinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstNum; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= secondNum; j++) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        for (int k = 1; k <= thirdNum; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, j, k);
                            }
                        }
                    }
                }
            }
        }
    }
}
