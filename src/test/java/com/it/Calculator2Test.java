package com.it;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2Test {

    @Test
    void testAdd() {
        Calculator2 mycalc = new Calculator2();
        assertEquals(6, mycalc.add(1, 5));
    }

    @Test
    void testSubtract(){
        Calculator2 calculator2 = new Calculator2();
        assertEquals(1, calculator2.subtract(7,6));
    }

    @Test
    void testMultiply(){
        Calculator2 calculator2 = new Calculator2();
        assertEquals(25, calculator2.multiply(5,5));
    }
}