package moshJava;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        while(true) {
            System.out.print("Principal: ");
            principal = input.nextInt();
            if (principal >= 1000 && principal <=1_000_000){
                break;
            }
            System.out.println("Enter valid value between 1000 to 1,000,000");
        }

        while (true){
            System.out.print("Annual interest Rate: ");
            float rate = input.nextFloat();
            if (rate >= 1 && rate <= 30){
                monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter valid value between 1 and 30");
        }


        while (true) {
            System.out.print("Period (Years): ");
            int years = input.nextInt();
            if (years >=1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter valid value between 1 and 30");
        }
        double mortgage = principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted );


    }
}
