package Chapter2Test;

import org.junit.jupiter.api.Test;
import testingClasses.Arithmetic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ArithmeticTest {

    @Test
    void testThatObjectExists() {
        Arithmetic arithmetic = new Arithmetic();
        assertNotNull(arithmetic);
    }

    @Test
    void userToEnterFirstInteger(){
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(8, arithmetic.setNum1(8));
    }
    @Test
    void userToEnterSecondInteger(){
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(5, arithmetic.setNum2(5));
    }

    @Test
    void squareOfNum1() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(16,arithmetic.squareNum1(4));
    }

    @Test
    void squareOfNum2() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(4,arithmetic.squareNum2(2));
    }

    @Test
    void sumOfSquare() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(8, arithmetic.sumOfSquare(2,2));
    }

    @Test
    void differenceOfSquare() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(0, arithmetic.differenceSquare(2,2));
    }

}
