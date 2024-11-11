package Ejercicio20;

import java.util.ArrayList;
import java.util.List;

public class AccountBank {
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public AccountBank(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: " + initialBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
            return false;
        } else {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount);
            return true;
        }
    }

    public boolean transfer(AccountBank targetAccount, double amount) {
        if (withdraw(amount)) {
            targetAccount.deposit(amount);
            transactionHistory.add("Transferred " + amount + " to account " + targetAccount.getAccountNumber());
            targetAccount.transactionHistory.add("Received " + amount + " from account " + this.accountNumber);
            return true;
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
            return false;
        }
    }

    public void showTransactionHistory() {
        System.out.println("Transaction history for account " + accountNumber + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
