package chapter02;

import java.util.Scanner;

public class NegativePositiveZeroValue {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = console.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = console.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = console.nextInt();
        System.out.print("Enter fourth number: ");
        int fourthNumber = console.nextInt();
        System.out.print("Enter fifth number: ");
        int fifthNumber = console.nextInt();

        if (firstNumber < 0){
            System.out.printf("First number is negative number of %d%n", firstNumber);
        }
        if (firstNumber > 0){
            System.out.printf("First number is positive number of %d%n", firstNumber);
        }
        if (firstNumber == 0){
            System.out.printf("First number is  zero input of %d%n", firstNumber);
        }

        if (secondNumber < 0){
            System.out.printf("Second number is negative number of %d%n", secondNumber);
        }
        if (secondNumber > 0){
            System.out.printf("Second number is positive number of %d%n", secondNumber);
        }
        if (secondNumber == 0){
            System.out.printf("Second number is  zero input of %d%n", secondNumber);
        }

        if (thirdNumber < 0){
            System.out.printf("Third number is negative number of %d%n", thirdNumber);
        }
        if (thirdNumber > 0){
            System.out.printf("Third number is positive number of %d%n", thirdNumber);
        }
        if (thirdNumber == 0){
            System.out.printf("Third number is  zero input of %d%n", thirdNumber);
        }

        if (fourthNumber < 0){
            System.out.printf("Fourth number is negative number of %d%n", fourthNumber);
        }
        if (fourthNumber > 0){
            System.out.printf("Fourth number is positive number of %d%n", fourthNumber);
        }
        if (fourthNumber == 0){
            System.out.printf("Fourth number is  zero input of %d%n", fourthNumber);
        }

        if (fifthNumber < 0){
            System.out.printf("Fifth number is negative number of %d%n", fifthNumber);
        }
        if (fifthNumber > 0){
            System.out.printf("Fifth number is positive number of %d%n", fifthNumber);
        }
        if (fifthNumber == 0){
            System.out.printf("Fifth number is  zero input of %d%n", fifthNumber);
        }
    }
}
