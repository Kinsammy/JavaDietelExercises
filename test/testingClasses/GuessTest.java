package testingClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GuessTest {
    @Test
    public void isObjectExist(){
        Guess number = new Guess();
        assertNotNull(number);
    }

    @Test
    public void guessRightNumberTest(){
        Guess number = new Guess();
        assertEquals("is  the right Number", number.guess(55));
    }

    @Test
    public void guessFrom_1_To_54_Test(){
        Guess number = new Guess();
        assertEquals("is too low", number.outcome(54));
    }

    @Test
    public void guessFrom_56_To_100_Test(){
        Guess number = new Guess();
        assertEquals("is too high", number.outcome(100));
    }
}
