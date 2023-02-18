package kunaDataStructureAlgorithm.linearSearch;

import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.linearSearch.MultiDimensionalSearch.indexSearch;
import static kunaDataStructureAlgorithm.linearSearch.MultiDimensionalSearch.search;
import static org.junit.jupiter.api.Assertions.*;

class MultiDimensionalSearchTest {

    @Test
    public void findElementIn2DArrayByValue(){
        int[][] lists = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 99;
        int number = search(lists, target);
        assertEquals(99, number);
    }

    @Test
    public void findElementIn2DArrayByIndex(){
        int[][] lists = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 99;
        int[] number = indexSearch(lists, target);
        assertArrayEquals(new int[]{2, 1}, number);


    }

}