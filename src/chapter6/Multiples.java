package chapter6;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = input.nextInt();
        isMultiples(firstNum, secondNum);

    }
    public static void isMultiples(int firstNumber, int secondNumber) {
        if (firstNumber % secondNumber == 0){
            System.out.printf("%d is a multiple of %d", secondNumber, firstNumber);
        }
        else {
            System.out.printf("%d is not a multiple of %d", secondNumber, firstNumber);
        }
    }
}
