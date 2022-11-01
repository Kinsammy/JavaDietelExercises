package chapter02;

import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();
        firstNumber = firstNumber * 3;
        secondNumber = secondNumber * 2;

        if (firstNumber % secondNumber == 0){
            System.out.printf("First number: %d is multiple of Second Number: %d", firstNumber, secondNumber);
        }
        else {
            System.out.printf("First number: %d is not multiple of Second Number: %d", firstNumber, secondNumber);

        }


    }
}
