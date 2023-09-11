package kunaDataStructureAlgorithm.linearSearch;

import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.linearSearch.FindMin.maxElement;
import static kunaDataStructureAlgorithm.linearSearch.FindMin.minElement;
import static org.junit.jupiter.api.Assertions.*;

class FindMinTest {

    @Test
    void minElementTest(){
        int[] numbers = {18, 12, 7, 3, 14, 28};
        int minNumber = minElement(numbers);
        assertEquals(3, minNumber);
    }

    @Test
    void maxElementTest(){
        int[] numbers = {18, 12, 7, 3, 14, 28};
        int minNumber = maxElement(numbers);
        assertEquals(28, minNumber);
    }
}