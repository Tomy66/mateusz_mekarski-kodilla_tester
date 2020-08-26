package com.kodilla.basic_asseration;

import com.kodilla.basic_assertion.Calculator;
import org.junit.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;


public class CalculatorTestSuite {
    Calculator calculator =new Calculator();


    @Test
    public void testSum() {
        //Given
        int a = 5;
        int b = 8;
        //When
        int sumResult = calculator.sum(a, b);
        //Then
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {

        int a = 10;
        int b = 7;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(3, subtractResult);
    }

    @Test
    public void testPow1() {

        int a = 4;
        int powResult = calculator.pow(a);
        assertEquals(16, powResult);

    }

    @Test
    public void testPow2() {

        int a1 = -2;
        int powResult1 = calculator.pow(a1);
        assertEquals(4, powResult1);
    }

    @Test
    public void testPow3() {

        int a2 = 0;
        int powResult2 = calculator.pow(a2);
        assertEquals(0, powResult2);
    }



}
