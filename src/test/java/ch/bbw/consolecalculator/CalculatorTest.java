package ch.bbw.consolecalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testee;

    @Before
    public void setup() {
        testee = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk() {
        assertTrue(testee.summe(10,25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk(){
        assertTrue(testee.subtraktion(20, 7) == 13);
    }

    @Test
    public void testSummeZweiNegativeIsOk(){
        assertTrue(testee.summe(-20, -7) == -27);
    }

    @Test
    public void testSubtractionZweiNegativeIsOk(){
        assertTrue(testee.subtraktion(-4, -8) == 4);
    }

    @Test(expected = java.lang.AssertionError.class)
    public void testDivisionNull(){
        assertTrue(testee.division(20, 0) == 0);
    }

    @Test
    public void testDivisionZweiPositiveIsOk(){
        assertTrue(testee.division(8, 4) == 2);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testSummeZweiPositiveWithOverflowsException(){
        assertTrue(testee.summe(Integer.MAX_VALUE, 2) != 0);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testSummeZweiPositiveGreaterThan0(){
        assertTrue(testee.summe(Integer.MAX_VALUE, 2) > 0);
    }

    @After
    public void finished() {
        System.out.println("Done With Calculations!");
    }



}