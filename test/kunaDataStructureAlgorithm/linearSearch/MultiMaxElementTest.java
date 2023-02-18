package kunaDataStructureAlgorithm.linearSearch;

import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.linearSearch.Multi_Max_Min_Element.maxElement;
import static kunaDataStructureAlgorithm.linearSearch.Multi_Max_Min_Element.minElement;
import static org.junit.jupiter.api.Assertions.*;

class MultiMaxElementTest {

    @Test
    void maxElementTest() {
        int[][] lists = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 99;
        int maxValue = maxElement(lists, target);
        assertEquals(99, maxValue);
    }

    @Test
    void minElementTest() {
        int[][] lists = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 1;
        int maxValue = minElement(lists, target);
        assertEquals(1, maxValue);
    }
}