package com.junitpractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountAssertionTest {
    @Test
    @DisplayName("Withdraw 300 successfully")
    public void testWithDraw(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertEquals(300, bankAccount.withdraw(200));
    }

    @Test
    @DisplayName("Deposit 200 successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(200);
        assertEquals(600, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Balance becomes negative")
    public  void withdrawNotStuckAtZero(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800);
        assertNotEquals(0, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test account activation after creation")
    public void testActive(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        //bankAccount.setActive(false);
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Test holder name set")
    public void testHolderName(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.setHolderName("Honey");
       assertNotNull(bankAccount.getHolderName());
    }

    @Test
    @DisplayName("Test that we can't withdraw below minim")
    public void noWithdrawBelow(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));
    }

    @Test
    public void testWithdrawAndDepositWithoutException(){
        BankAccount bankAccount = new BankAccount(500, -1000);

        assertAll(
                () -> assertEquals(700, bankAccount.deposit(200)),
                () -> assertEquals(-700, bankAccount.withdraw(1400))
        );
    }

    @Test
    @DisplayName("Test deposit timeout")
    public void testDepositTimeout(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertTimeout(Duration.ofNanos(1), ()-> bankAccount.deposit(200));
    }

}
