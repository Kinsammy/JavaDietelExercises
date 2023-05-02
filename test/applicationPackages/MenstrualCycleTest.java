package applicationPackages;

import applicationPackages.menstrualCycle.MenstrualCycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MenstrualCycleTest {
    private MenstrualCycle menstrualCycle;

    @BeforeEach
    public void setup(){
        menstrualCycle = new MenstrualCycle();
        menstrualCycle.setPeriodStartDate("01/04/2023");
        menstrualCycle.setCycleLength(28);
    }



    @Test
    public void nextPeriodTest(){
        String nextPeriodDate = menstrualCycle.nextPeriod();
        assertEquals("29/04/2023", nextPeriodDate);
    }

    @Test
    public void ovulationDateTest(){
        String ovulation = menstrualCycle.ovulationDate();
        assertEquals("15/04/2023", ovulation);
    }

    @Test
    public void fertileWindowTest() {
        List<LocalDate> fertileDate = menstrualCycle.fertileWindow();
    }


}