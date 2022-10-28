package chapter02;

import java.util.Scanner;
public class GreatPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the estimated number of stones used: ");
        double estimatedNumber = input.nextDouble();
        System.out.print("Enter the average weight of each stone: ");
        double averageWeight = input.nextDouble();
        System.out.print("Enter number of years taken to build the pyramid: ");
        double numberOfYear = input.nextDouble();

        double weightOfYear = averageWeight / numberOfYear;
        double weightOfHour = weightOfYear / 8760;
        double weightOfMinute = weightOfHour / 60;

        System.out.printf("The estimate weight of the pyramid in a year is %.2f%n", weightOfYear);
        System.out.printf("The estimate weight of the pyramid in an hour is %.2f%n", weightOfHour);
        System.out.printf("The estimate weight of the pyramid in a minute is %.2f%n", weightOfMinute);
    }
}
