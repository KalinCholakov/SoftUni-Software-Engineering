package Exercises;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if (i == 1 || i == input) {
                    System.out.print("*");
                } else if (j == 1 || j == input) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

