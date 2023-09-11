package chapter02;

import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Weight in Pounds: ");
        int weightInPounds = input.nextInt();
        System.out.print("Enter Height in Inches: ");
        int heightInInches = input.nextInt();

        int bodyMassIndex = (weightInPounds * 703) / (heightInInches * heightInInches);

        System.out.printf("The body mass index calculator is %d", bodyMassIndex);
    }
}
