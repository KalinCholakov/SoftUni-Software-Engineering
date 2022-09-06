package com.company;

import java.util.Scanner;

public class Problem_06_Strong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int number = input;
        int sumFact = 0;

        while (input > 0) {
            int lastDigit = input % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            input /= 10;
        }
        if (number == sumFact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
