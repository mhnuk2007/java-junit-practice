package com.junitpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator = new SimpleCalculator();
    @Test
    public void testAdd() {
        assertEquals(8, simpleCalculator.add(5, 3));
    }
}
