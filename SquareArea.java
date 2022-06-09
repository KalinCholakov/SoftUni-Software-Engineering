package Exercises;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        double a = scanner.nextDouble();
        double area = a * a;

        System.out.printf("The area of square is: %.2f", area);
    }
}