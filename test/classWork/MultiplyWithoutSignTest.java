package classWork;

import org.junit.jupiter.api.Test;

import static classWork.MultiplyWithoutSign.operationWithoutSign;
import static classWork.MultiplyWithoutSign.operationWithoutSign;
import static classWork.MultiplyWithoutSign.operationWithoutSign;
import static classWork.MultiplyWithoutSign.operationWithoutSign;
import static classWork.MultiplyWithoutSign.operationWithoutSign;
import static org.junit.jupiter.api.Assertions.*;

class MultiplyWithoutSignTest {

    @Test
    void operationWithoutSignTest() {
        int firstNumber = 3;
        int secondNumber = 2;
        int total = MultiplyWithoutSign.operationWithoutSign(firstNumber, secondNumber);
        assertEquals(6, total);
    }

    @Test
    void operationWithoutSignForNegativeNumberTest() {
        int firstNumber = -3;
        int secondNumber = -2;
        int total = MultiplyWithoutSign.operationWithoutSign(firstNumber, secondNumber);
        assertEquals(6, total);
    }
}