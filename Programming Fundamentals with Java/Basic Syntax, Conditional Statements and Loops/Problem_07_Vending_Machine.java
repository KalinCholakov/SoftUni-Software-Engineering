package com.company;

import java.util.Scanner;

public class Problem_07_Vending_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumCoins = 0;

        String command = scanner.nextLine();
        while (!command.equals("Start")) {
            double inputCoin = Double.parseDouble(command);
            if (inputCoin == 0.1 || inputCoin == 0.2 || inputCoin == 0.5 || inputCoin == 1 || inputCoin == 2) {
                sumCoins += inputCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", inputCoin);
            }
            command = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sumCoins >= 2.0) {
                        System.out.println("Purchased Nuts");
                        sumCoins -= 2.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sumCoins >= 0.7) {
                        System.out.println("Purchased Water");
                        sumCoins -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sumCoins >= 1.5) {
                        System.out.println("Purchased Crisps");
                        sumCoins -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sumCoins >= 0.8) {
                        System.out.println("Purchased Soda");
                        sumCoins -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sumCoins >= 1.0) {
                        System.out.println("Purchased Coke");
                        sumCoins -= 1.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", sumCoins);
    }
}
