package ch.bbw.consolecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testee;

    @Test
    public void testSummeZweiPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(10,25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(20, 7) == 13);
    }

    @Test
    public void testSummeZweiNegativeIsOk(){
        testee = new Calculator();
        assertTrue(testee.summe(-20, -7) == -27);
    }

    @Test
    public void testSubtractionZweiNegativeIsOk(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(-4, -8) == 4);
    }

    @Test(expected = java.lang.AssertionError.class)
    public void testDivisionNull(){
        testee = new Calculator();
        assertTrue(testee.division(20, 0) == 0);
    }


}