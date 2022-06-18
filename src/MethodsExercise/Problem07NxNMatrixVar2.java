package MethodsExercise;

import java.util.Scanner;

public class Problem07NxNMatrixVar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            printLine(num);
        }
    }

    private static void printLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
