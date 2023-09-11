package chapter02;

import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int numSquare = num * num;

        System.out.printf("The square of the number is %d%n", numSquare);
        if (numSquare > 100) {
            System.out.println("Number and It's square are greater than 100");
        }
        if (numSquare == 100) {
            System.out.println("Number and it's square are equal to 100");
        }
        if (numSquare != 100) {
            System.out.println("Number and it's square are not equal to 100");
        }
        if (numSquare < 100) {
            System.out.println("Number and it's square are less than to 100");
        }
    }
}
