package testingClasses;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    
    @Test
    void testThatObjectExist() {
        Calculator calculator = new Calculator(5, 8);
        assertNotNull(calculator);
    }

    @Test
    void sumOfTwoInteger() {
        Calculator calculator = new Calculator(5, 8);
        assertEquals(10,calculator.addTwoNumber(3,7));
    }

    @Test
    void multiplyThreeInteger() {
        Calculator calculator = new Calculator(5, 8);
        assertEquals(60, calculator.multiply(5,6,2));
    }

    @Test
    void substractTwoNumber() {
        Calculator calculator = new Calculator(5, 8);
        assertEquals(15,calculator.substract(30,15));
    }

    @Test
    void divideTwoNumbers() {
        Calculator calculator = new Calculator(5, 8);
        assertEquals(50, calculator.divide(200,4));
    }

    @Test
    void squareRootOfNumber() {
        Calculator calculator = new Calculator(5, 8);
        assertEquals(4, calculator.squareRoot(16));
    }
}
