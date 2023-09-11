package chapter02;

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int firstNumberSquare = firstNumber * firstNumber;
        int secondNumberSquare = secondNumber * secondNumber;

        int sum = firstNumber + secondNumber;
        int difference = firstNumberSquare - secondNumberSquare;

        System.out.printf("The Square of the first number is %d%n", firstNumberSquare);
        System.out.printf("The Square of the first number is %d%n", secondNumberSquare);
        System.out.printf("The difference between the squares is %d%n",sum);
        System.out.printf("The difference between the squares is %d",difference);

    }
}
