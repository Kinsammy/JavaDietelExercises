package applicationPackages.menstrualCycle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MenstrualCycle {
    private String periodStartDate;
    private int cycleLength;



    public String getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(String periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public int getCycleLength() {
        return cycleLength;
    }

    public void setCycleLength(int cycleLength) {
        this.cycleLength = cycleLength;
    }

    public String nextPeriod() {
        String datePattern = "dd/MM/yyyy";
        LocalDate firstDay = LocalDate.parse(getPeriodStartDate(), DateTimeFormatter.ofPattern(datePattern));

        LocalDate nexPeriodDate = firstDay.plusDays(getCycleLength());

        return nexPeriodDate.format(DateTimeFormatter.ofPattern(datePattern));
    }


    public String ovulationDate() {
        String datePattern = "dd/MM/yyyy";
        LocalDate firstDay = LocalDate.parse(getPeriodStartDate(), DateTimeFormatter.ofPattern(datePattern));
        LocalDate ovulationDate = firstDay.plusDays(14);
        return ovulationDate.format(DateTimeFormatter.ofPattern(datePattern));
    }

    public List<LocalDate> fertileWindow(){
        String datePattern = "dd/MM/yyyy";
        LocalDate ovulationDay = LocalDate.parse(ovulationDate(), DateTimeFormatter.ofPattern(datePattern));
        List<LocalDate>  fertileWindows = new ArrayList<>();
        int fertileDays = 5;
        for (int day =1; day <= fertileDays; day++){
            LocalDate dayBeforeOvulationDay= ovulationDay.minusDays(day);
            fertileWindows.add(dayBeforeOvulationDay);
        }
        return fertileWindows;
    }
}
