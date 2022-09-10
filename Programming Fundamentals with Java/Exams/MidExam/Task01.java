package MidExamJavaFundSoftuni;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(scanner.nextLine());
        int countStops = 0;
        double totalProfit = 0;

        while (numberOfCities > 0) {
            String nameOfCity = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            double earnedMoney = 0;
            countStops++;
            if (countStops % 3 == 0 && countStops % 5 != 0) {
                earnedMoney = income - expenses * 1.5;
            } else if (countStops % 5 == 0) {
                earnedMoney = income * 0.9 - expenses;
            } else {
                earnedMoney = income - expenses;
            }

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", nameOfCity, earnedMoney);
            totalProfit += earnedMoney;
            numberOfCities--;
        }

        System.out.printf("Burger Bus total profit: %.2f leva.%n", totalProfit);
    }
}
