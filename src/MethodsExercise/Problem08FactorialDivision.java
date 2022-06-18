package MethodsExercise;

import java.util.Scanner;

public class Problem08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long fact1 = factorialOfInteger(num1);
        long fact2 = factorialOfInteger(num2);

        System.out.printf("%.2f", fact1 * 1.0 / fact2);
    }

    public static long factorialOfInteger(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }
}
