package kunaDataStructureAlgorithm.linearSearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.linearSearch.LinearSearch.elementLinearSearch;
import static kunaDataStructureAlgorithm.linearSearch.LinearSearch.linearSearch;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

   @Test
    public void linearSearchTestForElement_9(){
       int[] numbers = {3,13, 8, 9, 7, 12, 9, 2, 1};
       int target = 9;
       int answer = elementLinearSearch(numbers, target);
       assertEquals(9, answer);
   }

   @Test
   public void linearSearchTestForElementNotInTheCollection(){
      int[] numbers = {3,13, 8, 9, 7, 12, 9, 2, 1};
      int target = 10;
      int answer = linearSearch(numbers, target);
      assertEquals(-1, answer);
   }

   @Test
   public void linearSearchTestForIndex(){
      int[] numbers = {3,13, 8, 9, 7, 12, 9, 2, 1};
      int target = 9;
      int answer = linearSearch(numbers, target);
      assertEquals(3, answer);
   }
}