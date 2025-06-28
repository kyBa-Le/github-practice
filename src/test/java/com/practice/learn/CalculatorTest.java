package com.practice.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void twoAddTwoShouldEqualFour() {
        var cal  = new Calculator();
        assertEquals(4, cal.add(2, 2));
    }

    @Test
    public void threeAddTwoShouldEqualFive() {
        var cal  = new Calculator();
        assertEquals(5, cal.add(3, 2));
    }

    @Test
    public void threeAddThreeShouldEqualSix() {
        var cal  = new Calculator();
        assertEquals(6, cal.add(3, 3));
    }
}