package com.company;

import java.util.Scanner;

public class Problem_11_Rage_Expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = gamesLost / 2;
        int mouseCount = gamesLost / 3;
        int keyboardCount = gamesLost / 6;
        int displayCount = gamesLost / 12;

        double totalSum = (headsetCount * headsetPrice)
                + (mouseCount * mousePrice)
                + (keyboardCount * keyboardPrice)
                + (displayCount * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
