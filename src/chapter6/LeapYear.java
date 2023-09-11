package chapter6;

public class LeapYear {

    public static void isLeapYear(int year){
        if (year % 4 == 0){
            System.out.printf("The year %d is a leap year", year);
        }
        else {
            System.out.printf("The year %d is not a leap year", year);
        }
    }
}
