package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    private HugeInteger hugeInteger;

    @BeforeEach
    public void setup(){
        hugeInteger = new HugeInteger();
    }

    @Test
    public void testThatObjectExist() {
        assertNotNull(hugeInteger);
    }

    @Test
    public void testParseMethod() {
        String number = "12345";
        hugeInteger.parse(number);
        int[] array = hugeInteger.getDigitArray();
        assertEquals(1, array[0]);
    }

    @Test
    public void testMethodCanAddNumbers(){
        int firstValue= 123;
        int secondValue = 456;
        assertEquals(579, hugeInteger.add(firstValue, secondValue));
    }

    @Test
    public void testIsEqualMethod() {
        int firstNumber = 1;
        int secondNumber = 1;
        assertTrue(hugeInteger.isEqualTo(firstNumber, secondNumber));
    }

    @Test
    public void testIsNotEqualToMethod(){
        int firstNumber = 2;
        int secondNumber = 11;
        assertTrue(hugeInteger.isNotEqualTo(firstNumber, secondNumber));
    }

    @Test
    public void testGreaterThanMethod(){
        int firstNumber = 2;
        int secondNumber = 1;
        assertTrue(hugeInteger.isGreaterThan(firstNumber, secondNumber));
    }

    @Test
    public void testLessThanMethod(){
        int firstNumber = 2;
        int secondNumber = 11;
        assertTrue(hugeInteger.isLessThan(firstNumber, secondNumber));
    }

    @Test
    public void testGreaterThanOrEqualToMethod(){
        int firstNumber = 21;
        int secondNumber = 11;
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(firstNumber, secondNumber));
    }

    @Test
    public void testLessThanOrEqualToMethod(){
        int firstNumber = 1;
        int secondNumber = 11;
        assertTrue(hugeInteger.isLessThanOrEqualTo(firstNumber, secondNumber));
    }

//    @Override
//    public String toString() {
//        return "HugeIntegerTest{" +
//                "hugeInteger=" + hugeInteger +
//                '}';
//    }
}
