package kunaDataStructureAlgorithm.linearSearch;

import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.linearSearch.SearchRange.rangeSearch;
import static org.junit.jupiter.api.Assertions.*;

class SearchRangeTest {

    @Test
    void rangeSearchTest() {
        int[] numbers = {18, 12, -7, 3, 14, 28};
        int target = -7;
        int start = 1;
        int end = 4;
        int element = rangeSearch(numbers, target, start, end);
        assertEquals(2, element);
    }
}