package chapter6;

import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year you want to know if is a leap year or not: ");
        int year = input.nextInt();
        LeapYear.isLeapYear(year);
    }
}
