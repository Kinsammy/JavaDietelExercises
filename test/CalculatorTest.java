import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testingClasses.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
        void startAllTestWith() {
        calculator = new Calculator(15, 34);
    }

    @Test
    void testThatObjectExist() {
        assertNotNull(calculator);
    }

    @Test
    void sumOfTwoInteger() {
        assertEquals(10,calculator.addTwoNumber(3,7));
    }

    @Test
    void multiplyThreeInteger() {
        assertEquals(60, calculator.multiply(5,6,2));
    }

    @Test
    void substractTwoNumber() {
        assertEquals(15,calculator.substract(30,15));
    }

    @Test
    void divideTwoNumbers() {
        assertEquals(50, calculator.divide(200,4));
    }

    @Test
    void squareRootOfNumber() {
        assertEquals(4, calculator.squareRoot(16));
    }
}
