package MethodsExercise;

import java.util.Scanner;

public class Problem01SmallestOfThreeNumbersVar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3 цели числа
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        //метод, който принтира най-малкото число
        printSmallestNumber(number1, number2, number3);
    }

    private static void printSmallestNumber(int n1, int n2, int n3) {
        //1-вото
        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
        }
        //2-рото
        else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        }
        //3-тото
        else if (n3 <= n1 && n3 <= n2) {
            System.out.println(n3);
        }
    }
}
