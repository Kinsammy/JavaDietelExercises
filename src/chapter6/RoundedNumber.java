package chapter6;

import java.util.Scanner;

public class RoundedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a double values: ");
        double actualNumber = input.nextDouble();
        double  newNumber= Math.floor(actualNumber + 0.5);

        System.out.printf("The actual number is %.4f%nThe new number is %.4f",
                actualNumber, newNumber);
    }
}
