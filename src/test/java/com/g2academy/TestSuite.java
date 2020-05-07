package com.g2academy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(CalculatorTest.class)
public class TestSuite {
    @BeforeClass
    public static void init() {
        System.out.println("\n==== Test Started ===\n");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("\n=== Test Finished ===\n");
    }
}
