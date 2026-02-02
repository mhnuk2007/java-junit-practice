package com.junitpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator = new SimpleCalculator();
    @Test
    public void testAdd() {
        assertEquals(8, simpleCalculator.add(5, 3));
    }
    @Test
    public void testSub() {
        assertEquals(2, simpleCalculator.sub(5, 3));
    }
    @Test
    public void testMultiply() {
        assertEquals(15, simpleCalculator.mul(5, 3));
    }
    @Test
    public void testDivide() {
        assertEquals(2, simpleCalculator.div(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> simpleCalculator.div(5, 0));
    }
}
