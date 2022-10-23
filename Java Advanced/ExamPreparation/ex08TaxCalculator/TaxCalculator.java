package examPreparation.ex08TaxCalculator;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(">>");

        double totalCollectTax = 0;


        for (int i = 0; i < input.length; i++) {
            String[] cars = input[i].split(" ");
            String carType = cars[0];
            int yearsTaxBePaid = Integer.parseInt(cars[1]);
            int distanceTraveled = Integer.parseInt(cars[2]);
            int taxIncrease;
            int taxDecrease;
            double totalTax;

            if (carType.equals("family")) {
                taxIncrease = (distanceTraveled / 3000) * 12;
                taxDecrease = 50 - yearsTaxBePaid * 5;
            } else if (carType.equals("heavyDuty")) {
                taxIncrease = (distanceTraveled / 9000) * 14;
                taxDecrease = 80 - yearsTaxBePaid * 8;
            } else if (carType.equals("sports")) {
                taxIncrease = (distanceTraveled / 2000) * 18;
                taxDecrease = 100 - yearsTaxBePaid * 9;
            } else {
                System.out.println("Invalid car type.");
                continue;
            }
            totalTax = taxIncrease + taxDecrease;
            totalCollectTax += totalTax;

            System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTax);
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", totalCollectTax);
    }
}
