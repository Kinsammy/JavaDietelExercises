package exerciseWithChief;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import revisionWithChief.exercisesWithChief.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @BeforeEach
    public void setUp(){

    }

    @Test
    public void factorial(){
        long factorial = Calculator.factorial(5);
        assertEquals(120, factorial);
        factorial = Calculator.factorial(13);
        assertEquals(6227020800L, factorial);
    }
}
