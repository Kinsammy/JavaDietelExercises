package chapter6Test;

import chapter6.Hypotenuse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HypotenuseTest {
    private Hypotenuse hypotenuse;
    @BeforeEach
    public void setUp () {
        hypotenuse = new Hypotenuse();

    }

    @Test
    public void testThatObjectExist() {
        assertNotNull(hypotenuse);
    }

    @Test
    public void testSquareOfFirstSides() {
        assertEquals(9, Hypotenuse.getFirstSquare(3));
    }

    @Test
    public void testSquareOfSecondSides() {
        assertEquals(16, Hypotenuse.getSecondSquare(4));
    }

    @Test
    public void testTheHypotenuseOfRightTriangleWithTwoSides(){
        assertEquals(13, Hypotenuse.getHypotenuse(5, 12));
    }
}
