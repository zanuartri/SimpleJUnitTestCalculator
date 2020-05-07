package com.g2academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    private int total;

    @Before
    public void calculatorInit() {
        total = 0;
    }

    @Test
    public void testAdd() {
        System.out.println("[testing add function]");
        total = calculator.add(500, 600);
        assertEquals(1100, total);
    }

    @Test
    public void testSubtract() {
        System.out.println("[testing subtract function]");
        total = calculator.subtract(10000, 500);
        assertEquals(9500, total);
    }

    @Test
    public void testMultiply() {
        System.out.println("[testing multiply function]");
        total = calculator.multiply(50, 30);
        assertEquals(1500, total);
    }

    @Test
    public void testDivide() {
        System.out.println("[testing divide function]");
        total = calculator.divide(100, 20);
        assertEquals(5, total);
    }

    @After
    public void calculatorTeardown() {
        // do some code
    }
}
