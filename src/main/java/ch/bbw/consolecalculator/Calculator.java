package ch.bbw.consolecalculator;

/**
 * Calculator
 * - Kann 2 Zahlen addieren
 * @author Nicolas Amberg
 * @version 0.0.1
 */

public class Calculator {
    public int summe(int summand1, int summand2) throws java.lang.ArithmeticException{
        long value = (long) summand1 + (long) summand2;
        if((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException();
        }
        return summand1 + summand2;
    }
    public int subtraktion(int value1, int value2){
        return value1-value2;
    }
    public double division(double value1, double value2){
        return value1/value2;
    }
    public double multi(double value1, double value2) {
        return value1*value2;
    }
}
