package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilsTest {

    @Test
    public void testEvenOddNumberForEven() {
        NumberUtils utils = new NumberUtils();
        boolean result = utils.evenOddNumber(4);
        assertTrue(result, "4 should be even");
    }

    @Test
    public void testEvenOddNumberForOdd() {
        NumberUtils utils = new NumberUtils();
        boolean result = utils.evenOddNumber(7);
        assertFalse(result, "7 should be odd");
    }
    
    @Test
    public void testEvenOddNumberForZero() {
        NumberUtils utils = new NumberUtils();
        boolean result = utils.evenOddNumber(0);
        assertTrue(result, "0 should be even");
    }
    
    @Test
    public void testEvenOddNumberForNegativeEven() {
        NumberUtils utils = new NumberUtils();
        boolean result = utils.evenOddNumber(-6);
        assertTrue(result, "-6 should be even");
    }
    
    @Test
    public void testEvenOddNumberForNegativeOdd() {
        NumberUtils utils = new NumberUtils();
        boolean result = utils.evenOddNumber(-9);
        assertFalse(result, "-9 should be odd");
    }
}
