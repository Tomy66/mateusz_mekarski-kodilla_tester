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
//Given
        int a = 10;
        int b = 7;
        //When
        int subtractResult = calculator.subtract(a, b);
        //Then
        assertEquals(3, subtractResult);
    }

    @Test
    public void testPowPositiveNumber() {
//Given
        int a = 4;
        //When
        int powResult = calculator.pow(a);
        //Then
        assertEquals(16, powResult);

    }

    @Test
    public void testPowNegativeNumber() {
//Given
        int a = -2;
        //When
        int powResult1 = calculator.pow(a);
        //Then
        assertEquals(4, powResult1);
    }

    @Test
    public void testPowZero() {
//Given
        int a = 0;
        //When
        int powResult2 = calculator.pow(a);
        //Then
        assertEquals(0, powResult2);
    }



}
