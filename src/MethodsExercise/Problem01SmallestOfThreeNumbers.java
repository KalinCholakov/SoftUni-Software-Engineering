package MethodsExercise;

import java.util.Scanner;

public class Problem01SmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        smallestOfThreeNumbers(number1, number2, number3);
    }

    public static void smallestOfThreeNumbers(int number1, int number2, int number3) {
        int result = Math.min(number1, Math.min(number2, number3));

        System.out.println(result);
    }
}
