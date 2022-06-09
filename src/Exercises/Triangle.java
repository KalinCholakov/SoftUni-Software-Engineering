package Exercises;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

