package com.junitpractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BankAccountAssumptionTest {

    @Test
    @DisplayName("Test activation account after creation")
    public void  testActivationAccountAfterCreation() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        assumeFalse(bankAccount == null);
        assertTrue(bankAccount.isActive());
    }
}
