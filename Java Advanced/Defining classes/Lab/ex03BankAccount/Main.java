package definingClasses.lab.ex03BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        BiFunction<BankAccount, String[], String> depositFunction = (b, arr) -> {
            int amount = Integer.parseInt(arr[2]);
            b.deposit(amount);
            return "Deposited " + amount + " to ID" + arr[1];
        };

        BiFunction<BankAccount, String[], String> getInterestFunction = (b, arr) -> {
            int years = Integer.parseInt(arr[2]);
            double interest = b.getInterestRate(years);
            return String.format("%.2f", interest);
        };

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");

            String command = data[0];

            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                bankAccounts.put(bankAccount.getId(), bankAccount);
                System.out.println("Account ID" + bankAccount.getId() + " created");
            } else if (command.equals("Deposit")) {
                String output = executeOnBankAccount(data, bankAccounts, depositFunction);
                System.out.println(output);
            } else if (command.equals("SetInterest")) {
                double interestRate = Double.parseDouble(data[1]);
                BankAccount.setInterestRate(interestRate);
            } else if (command.equals("GetInterest")) {
                String output = executeOnBankAccount(data, bankAccounts, getInterestFunction);
                System.out.println(output);
            }

            input = scanner.nextLine();
        }
    }

    private static String executeOnBankAccount(String[] data, Map<Integer, BankAccount> bankAccounts,
                                               BiFunction<BankAccount, String[], String> function) {
        BankAccount bankAccount = bankAccounts.get(Integer.parseInt(data[1]));

        if (bankAccount == null) {
            return "Account does not exist";
        }

        return function.apply(bankAccount, data);
    }
}
