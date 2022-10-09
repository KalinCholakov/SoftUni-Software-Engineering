package definingClasses.lab.ex03BankAccount;

public class BankAccount {
    private static int nextId = 1;
    private static double interestRate = 0.02;
    private final int id;
    private double balance;

    public BankAccount() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return interestRate * years * balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
