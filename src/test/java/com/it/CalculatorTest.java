package com.it;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testGetResult(){
        Calculator calculator = new Calculator();
        calculator.setResult(200);
        assertEquals(200, calculator.getResult());
    }

    @Test
    void testAdder(){
        Calculator mycalc = new Calculator();
        mycalc.Adder(10.5, 20.4);
        assertEquals(30.9, mycalc.getResult());
    }


    @Test
    void testSubtract(){
        Calculator calculator = new Calculator();
        calculator.Subtract( 10, 3);
        assertEquals(7, calculator.getResult());
    }

    @Test
    void testDivision(){
        Calculator anothercalculator = new Calculator();
        anothercalculator.Division(10, 10);
        assertEquals(1, anothercalculator.getResult());
    }
    @Test
    void testExecute(){
        Calculator calc = new Calculator();
        calc.setFirstValue(5);
        calc.setSecondValue(10);
        calc.execute('a');
        assertEquals(15, calc.getResult());

        calc.execute('s');
        assertEquals(-5, calc.getResult());

    }


}
