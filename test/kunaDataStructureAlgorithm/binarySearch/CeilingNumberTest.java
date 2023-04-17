package kunaDataStructureAlgorithm.binarySearch;

import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.binarySearch.CeilingNumber.ceilingNumber;
import static org.junit.jupiter.api.Assertions.*;

class CeilingNumberTest {


    @Test
    public void ceilingNumberTest(){
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ceilingNum = ceilingNumber(numbers, target);
        assertEquals(5, ceilingNum);
    }

}