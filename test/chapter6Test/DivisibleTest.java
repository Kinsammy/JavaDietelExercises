package chapter6Test;

import chapter6.Divisible;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DivisibleTest {
    private Divisible number;

    @BeforeEach
    public void setUp(){
        number = new Divisible();
    }

    @Test
    public void testThatObjectExist() {
        assertNotNull(number);
    }

    @Test
    public void testThatNumberIsDivisibleBy_5() {
        assertEquals("Number is divisible by 5", number.divisible(20));
    }

    @Test
    public void testThatNumberIsNotDivisibleBy_5() {
        assertEquals("Number is not divisible by 5", number.divisible(26));
    }
}
