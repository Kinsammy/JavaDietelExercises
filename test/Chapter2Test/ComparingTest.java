package Chapter2Test;

import org.junit.jupiter.api.Test;
import testingClasses.Comparing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ComparingTest {
    @Test
    void testThatObjectExist(){
       Comparing number = new Comparing();
        assertNotNull(number);
    }

    @Test
    void numberEntered() {
        Comparing number = new Comparing();
        assertEquals(6,number.numberInput(6));
    }

    @Test
    void numberLessThan100() {
        Comparing number = new Comparing();
        assertEquals("Number less than 100", number.Numberless(60));
    }
    @Test
    void numberGreaterThan100() {
        Comparing number = new Comparing();
        assertEquals("Number Greater than 100", number.NumberGreat(110));
    }
    @Test
    void numberEqualTo100() {
        Comparing number = new Comparing();
        assertEquals("Number is equal to 100", number.NumberEqual(100));
    }

    @Test
    void numberNotEqualTo100() {
        Comparing number = new Comparing();
        assertEquals("Number is not equal to 100", number.NumberNotEqual(150));
    }

    @Test
    void squareOfNumber() {
        Comparing number = new Comparing();
        assertEquals(16,number.numberSquare(4));
    }

    @Test
    void squareOfNumberGreaterThan100() {
        Comparing number = new Comparing();
        assertEquals("Number squared is greater than 100",number.numberSquareGreater(25));
    }

    @Test
    void squareOfNumberEqualT0100() {
        Comparing number = new Comparing();
        assertEquals("Number squared equal to 100",number.numberSquareEqual(10));
    }


    @Test
    void squareOfNumberNotEqualT0100() {
        Comparing number = new Comparing();
        assertEquals("Number squared not equal to 100",number.numberSquareNotEqual(4));
    }

    @Test
    void squareOfNumberLessThan100() {
        Comparing number = new Comparing();
        assertEquals("Number squared is less than 100",number.numberSquareLess(4));
    }



}
