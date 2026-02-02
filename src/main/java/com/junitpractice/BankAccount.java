package com.junitpractice;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive = true;
    private String holderName;


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

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
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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

