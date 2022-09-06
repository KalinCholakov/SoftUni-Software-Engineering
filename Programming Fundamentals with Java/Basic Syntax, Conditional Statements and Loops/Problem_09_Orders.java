package com.company;

import java.util.Scanner;

public class Problem_09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= n; i++) {
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsule = Integer.parseInt(scanner.nextLine());
            System.out.printf("The price for the coffee is: $%.2f%n", days * countCapsule * priceCapsule);
            totalPrice += days * countCapsule * priceCapsule;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
