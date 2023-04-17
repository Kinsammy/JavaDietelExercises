package kunaDataStructureAlgorithm;

import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.ReverseNumber.reverse;
import static kunaDataStructureAlgorithm.ReverseNumber.reverseNum;
import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    @Test
    void reverseTest() {
        int numbers = 23579;
        int reverseInteger = reverse(numbers);
        assertEquals(97532, reverseInteger);
    }

    @Test
    void reverseNegativeIntegerTest() {
        int numbers = -579;
        int reverseInteger = reverse(numbers);
        assertEquals(-975, reverseInteger);
    }

    @Test
    void reverseLargerIntTest(){
        int numbers = 1534236469;
        int reverseInteger = reverseNum(numbers);
        assertEquals(0, reverseInteger);
    }
}