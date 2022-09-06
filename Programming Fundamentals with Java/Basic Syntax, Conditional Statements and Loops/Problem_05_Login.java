package com.company;

import java.util.Scanner;

public class Problem_05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = "";

        for (int i = user.length() - 1; i >= 0; i--) {
            char currentSymbol = user.charAt(i);
            pass += currentSymbol;
        }

        String enteredPass = scanner.nextLine();
        int countFailed = 0;

        while (!pass.equals(enteredPass)) {
            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();
        }
        if (pass.equals(enteredPass)) {
            System.out.printf("User %s logged in.", user);
        }
    }
}
