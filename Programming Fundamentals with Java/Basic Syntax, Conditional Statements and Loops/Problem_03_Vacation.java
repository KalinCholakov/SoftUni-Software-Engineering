package com.company;

import java.util.Scanner;

public class Problem_03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0;

        switch (type) {
            case "Students":
                if (day.equals("Friday") && numbers < 30) {
                    sum = numbers * 8.45;
                } else if (day.equals("Friday")) {
                    sum = numbers * 8.45 * 0.85;
                } else if (day.equals("Saturday") && numbers < 30) {
                    sum = numbers * 9.80;
                } else if (day.equals("Saturday")) {
                    sum = numbers * 9.80 * 0.85;
                } else if (day.equals("Sunday") && numbers < 30) {
                    sum = numbers * 10.46;
                } else if (day.equals("Sunday")) {
                    sum = numbers * 10.46 * 0.85;
                }
                break;
            case "Business":
                if (day.equals("Friday") && numbers < 100) {
                    sum = numbers * 10.90;
                } else if (day.equals("Friday")) {
                    sum = (numbers - 10) * 10.90;
                } else if (day.equals("Saturday") && numbers < 100) {
                    sum = numbers * 15.60;
                } else if (day.equals("Saturday")) {
                    sum = (numbers - 10) * 15.60;
                } else if (day.equals("Sunday") && numbers < 100) {
                    sum = numbers * 16;
                } else if (day.equals("Sunday")) {
                    sum = (numbers - 10) * 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday") && numbers >= 10 && numbers <= 20) {
                    sum = numbers * 15 * 0.95;
                } else if (day.equals("Friday")) {
                    sum = numbers * 15;
                } else if (day.equals("Saturday") && numbers >= 10 && numbers <= 20) {
                    sum = numbers * 20 * 0.95;
                } else if (day.equals("Saturday")) {
                    sum = numbers * 20;
                } else if (day.equals("Sunday") && numbers >= 10 && numbers <= 20) {
                    sum = numbers * 22.50 * 0.95;
                } else if (day.equals("Sunday")) {
                    sum = numbers * 22.50;
                }
                break;
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
