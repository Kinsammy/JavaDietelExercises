package chapter02;

import java.util.Scanner;
public class Values {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        System.out.print("Enter fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.print("Enter fifth number: ");
        int fifthNumber = input.nextInt();

        if (firstNumber > 0){
            System.out.println("First number is POSITIVE NUMBER."+firstNumber);
        }
        if (firstNumber < 0) {
            System.out.println("First number NEGATIVE NUMBER."+ firstNumber);
        }
        if (firstNumber == 0) {
            System.out.println("First number is ZERO VALUE."+ firstNumber);
        }

        if(secondNumber > 0){
            System.out.println("Second number is POSITIVE NUMBER."+ secondNumber);
        }
        if (secondNumber < 0) {
            System.out.println("Second number is NEGATIVE NUMBER."+ secondNumber);
        }
        if (secondNumber == 0) {
            System.out.println("Second number is ZERO VALUE."+ secondNumber);
        }

        if (thirdNumber > 0){
            System.out.println("Third number is POSITIVE NUMBER."+ thirdNumber);
        }
        if (thirdNumber < 0) {
            System.out.println("Third number is  NEGATIVE NUMBER."+ thirdNumber);
        }
        if (thirdNumber == 0) {
            System.out.println("Third number is ZERO VALUE."+ thirdNumber);
        }

        if (fourthNumber > 0){
            System.out.println("Fourth number is POSITIVE NUMBER." + fourthNumber);
        }
        if (fourthNumber < 0) {
            System.out.println("Fourth number NEGATIVE NUMBER." +fourthNumber);
        }
        if (fourthNumber == 0) {
            System.out.println("Fourth number is  ZERO VALUE." + fourthNumber);
        }

        if (fifthNumber > 0){
            System.out.println("Fifth number is  POSITIVE NUMBER."+ fifthNumber);
        }
        if (fifthNumber < 0) {
            System.out.println("Fifth number is NEGATIVE NUMBER."+ fifthNumber);
        }
        if (fifthNumber == 0) {
            System.out.println("Fifth number is ZERO VALUE."+ fifthNumber);
        }
    }
}
