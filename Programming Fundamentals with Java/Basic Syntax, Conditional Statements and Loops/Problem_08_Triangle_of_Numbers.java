package com.company;

import java.util.Scanner;

public class Problem_08_Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(i + " ");
                if (j == i) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
