package chapter3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class HeartRateApp {
    public static void main(String[] args) {
       HeartRate rate = new HeartRate("Ade","Idowu", 3,6,1994);

        System.out.printf("The initial Details%nFIRST NAME: %s%nLast NAME: %s%nDATE OF BIRTH: %d.%d.%d%n",
                rate.getFirstName(),rate.getLastName(),rate.getDay(),rate.getMonth(),rate.getYear());

        System.out.printf("The initial Details%nFIRST NAME: %s%nLast NAME: %s%nMaximum Heart Rate is %d%n Target",
                rate.getFirstName(),rate.getLastName(),rate.maximumHeartRate(), rate.targetHeartRate());

        System.out.printf("The current age is %d%n %.2f%n", rate.getAge(), rate.targetHeartRate());

    }

}
