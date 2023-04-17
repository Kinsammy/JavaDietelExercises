package leetCode;

import org.junit.jupiter.api.Test;

import static leetCode.EvenNumberCount.findEvenNumbers;
import static org.junit.jupiter.api.Assertions.*;

class EvenNumberCountTest {

    @Test
    void findEvenNumbersTest() {
        int[] numbers = {12, 345, 2, 6, 7896};
        int even = findEvenNumbers(numbers);
       assertEquals(2, even);
    }
}