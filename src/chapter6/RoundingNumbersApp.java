package chapter6;

import java.util.Scanner;

import static chapter6.RoundingNumbers.roundToInteger;
import static chapter6.RoundingNumbers.*;

public class RoundingNumbersApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value: ");
        double number = input.nextDouble();
        System.out.printf("The actual number is %.4f%nThe new number is %.4f%n",
                number,roundToInteger(number));
        System.out.printf("The actual number is %.4f%nThe new number is %.4f%n",
                number,roundToTenths(number));
        System.out.printf("The actual number is %.4f%nThe new number is %.4f%n",
                number,roundToHundredths(number));
        System.out.printf("The actual number is %.4f%nThe new number is %.4f%n",
                number,roundToThousandth(number));

    }
}
