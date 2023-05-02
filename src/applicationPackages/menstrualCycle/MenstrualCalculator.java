package applicationPackages.menstrualCycle;

import javax.swing.*;

public class MenstrualCalculator {
    public static void main(String[] args) {
        MenstrualCycle cycle = new MenstrualCycle();

        String periodStartDate = JOptionPane.showInputDialog("What date did your period start? [Date Format: dd/MM/yyyy ] ");
        int cycleLength = Integer.parseInt(JOptionPane.showInputDialog("How many days does it take before you see another period? "));
        cycle.setPeriodStartDate(periodStartDate);
        cycle.setCycleLength(cycleLength);
        String output = String.format("Your next Period is: %s%n" +
                "Your Ovulation date is %s%n" +
                "Your Fertile window dates are %s", cycle.nextPeriod(), cycle.ovulationDate(), cycle.fertileWindow());
        String title = "Menstrual Cycle";

        JOptionPane.showMessageDialog(null, output, title, JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
    






}
