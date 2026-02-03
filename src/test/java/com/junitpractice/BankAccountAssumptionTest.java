package com.junitpractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;

public class BankAccountAssumptionTest {

    @Test
    @DisplayName("Test activation account after creation")
    public void  testActivationAccountAfterCreation() {
        BankAccount bankAccount = new BankAccount(500, -1000);
//        assumeTrue(bankAccount != null);
//        assertTrue(bankAccount.isActive());

        assumeFalse(bankAccount == null);
        assertTrue(bankAccount.isActive());

        assumingThat(bankAccount != null, () -> assertTrue(bankAccount.isActive()));
    }
}
