package classWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static classWork.FormattingString.digitBatteryIncludedSelector;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FormattingStringTest {
    private FormattingString alphaNumeric;
    @BeforeEach
    public void setUp() {
        alphaNumeric = new FormattingString();

    }

    @Test
    public void testThatObjectExist(){
        assertNotNull(alphaNumeric);
    }

    @Test
    public void testThatAlphaNumericCanBePassToMethod(){
        assertEquals("a1a2a3a4a5a6", alphaNumeric.stringMethod("a1a2a3a4a5a6"));
    }

    @Test
    public void testThatIfAlphaNumericIsPassedToMethodItCanSelectTheIntegersValue(){
        assertEquals(6, alphaNumeric.digitCounterMethod("+Q234!8&20)("));
    }

    @Test
    public void testThatIfAlphaNumericIsPassedToMethodItCanSelectUsingBattery(){
        assertEquals(6, digitBatteryIncludedSelector("+Q234!8&20)("));
    }
}
