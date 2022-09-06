package com.company;

import java.util.Scanner;

public class Problem_10_Padawan_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(studentsCount * 1.1) * priceLight;
        double sumRobes = studentsCount * priceRobe;
        int freeBelts = studentsCount / 6;
        double sumBelts = (studentsCount - freeBelts) * priceBelt;

        double totalSum = sumLight + sumRobes + sumBelts;

        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double needMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }
    }
}
