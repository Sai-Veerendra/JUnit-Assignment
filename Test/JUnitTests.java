package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import Codes.Calculator;
import Codes.StringLength;
import Codes.NumberUtils;
import Codes.PrimeNum;

public class JUnitTests {
    Calculator calculator = new Calculator();
    StringLength stringLength = new StringLength();
    NumberUtils numberUtils = new NumberUtils();
    PrimeNum primeNum = new PrimeNum();

    @Test
    public void testAdd() {
        assertEquals(20, calculator.addNumbers(10, 10));
        assertEquals(0, calculator.addNumbers(0, 0));
        assertEquals(-20, calculator.addNumbers(-10, -10));
    }

    @Test
    public void testString() {
        assertEquals(3, stringLength.getStringLength("Sai"));
        assertEquals(0, stringLength.getStringLength(""));
    }

    @Test
    public void testEven() {
        assertTrue(numberUtils.isEven(4));
        assertFalse(numberUtils.isEven(5));
        assertTrue(numberUtils.isEven(0));
    }

    @Test
    public void testPrime() {
        assertTrue(primeNum.isPrime(5));
        assertTrue(primeNum.isPrime(2));
        assertFalse(primeNum.isPrime(10));
    }

}