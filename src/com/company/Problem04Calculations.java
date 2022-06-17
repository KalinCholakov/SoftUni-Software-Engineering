package com.company;

import java.util.Scanner;

public class Problem04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                addNumbers(a, b);
                break;
            case "multiply":
                multiplyNumbers(a, b);
                break;
            case "subtract":
                subtractNumbers(a, b);
                break;
            case "divide":
                divideNumbers(a, b);
                break;
        }
    }

    public static void addNumbers(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void multiplyNumbers(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    public static void subtractNumbers(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void divideNumbers(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }
}
