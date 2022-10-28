package chapter02;

import java.util.Scanner;
public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int divisible = number % 3;
        if (divisible == 0)
            System.out.print("The number is divisible by 3");
        if (divisible != 0)
            System.out.print("The number is not divisible by 3");
    }
}
