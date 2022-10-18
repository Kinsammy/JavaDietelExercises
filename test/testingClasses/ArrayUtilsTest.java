package testingClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsTest {
    @Test
    public void reverseArrayTest() {
        int[] array = {1, 2, 3, 4, 5};
        int[] reverseArray = ArrayUtils.reverseMethod(array);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reverseArray);
    }

    @Test
    public void reverseStringTest(){
        String input = "Adeleke";
        String output = ArrayUtils.reverseMethod(input);
        assertEquals("ekeledA", output);
    }
    @Test
    public void capitalizeTest(){
        String input = "adeleke";
        String output = ArrayUtils.capitalizeLetter(input);
        assertEquals("Adeleke", output);
    }

    @Test
    public void changeCasesToCapitalizeTest(){
        String input = "ADELEKE";
        String output = ArrayUtils.capitalizeLetter(input);
        assertEquals("Adeleke", output);
    }
}
