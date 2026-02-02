package com.junitpractice;

public class BankAccount {
    private double balance;
    private double minimumBalance;

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            return balance;
        } else {
            throw new RuntimeException("Insufficient Funds");
        }

    }
}

