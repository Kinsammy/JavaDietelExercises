package kunaDataStructureAlgorithm.binarySearch;

import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.binarySearch.NumberSearch.binarySearch;
import static org.junit.jupiter.api.Assertions.*;

class NumberSearchTest {

    @Test
    void binarySearchTest() {
        int[] numbers = {-18, -6, -2, 0, 2, 6, 8, 11, 18, 22, 36, 43};
        int target = 0;
        int search = binarySearch(numbers, target);
        assertEquals(3, search);
    }
}