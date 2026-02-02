package com.junitpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void testWithDraw(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertEquals(300, bankAccount.withdraw(200));
    }

    @Test
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(200);
        assertEquals(600, bankAccount.getBalance());
    }
}
