package chapter02;

import java.util.Scanner;
public class SeperateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        System.out.print("Enter a number with 5 digits: ");
        int number = input.nextInt();

        number1 = number / 10_000;
        number2 = number % 10_000 / 1_000;
        number3 = number % 10_000 % 1_000 / 100;
        number4 = number % 10_000 % 1_000 % 100 / 10;
        number5= number % 10_000 % 1_000 % 100 % 10;
        System.out.printf("The number entered is %d%nAnd it seperated into %d %d %d %d %d" ,number,number1, number2, number3, number4, number5);
    }
}
