package Chapter2Test;

import org.junit.jupiter.api.Test;
import testingClasses.ArithmeticThreeInt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CalculatorTest {

    @Test
    void testThatObjectExist() {
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertNotNull(number);
    }

    @Test
    void sumOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(30,number.sum(15,10,5));
    }

    @Test
    void averageOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(10,number.average(15,10,5));
    }


    @Test
    void productOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(60,number.product(3,10,2));
    }


    @Test
    void smallestOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(5,number.smallest(15,10,5));
    }

    @Test
    void largestOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(15,number.largest(15,10,5));
    }
}
