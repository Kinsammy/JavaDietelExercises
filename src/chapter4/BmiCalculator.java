package chapter4;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double kilogramPerPounds = 0.45359237;
        final double weightPerInch = 0.0254;

        System.out.println("Enter weight in pounds: ");
        int weight = input.nextInt();
        System.out.println("Enter height in inch: ");
        int height = input.nextInt();


    }
}
