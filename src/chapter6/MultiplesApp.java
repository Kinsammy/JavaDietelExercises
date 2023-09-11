package chapter6;

import java.util.Scanner;

import static chapter6.Multiples.isMultiples;

public class MultiplesApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = input.nextInt();
        isMultiples(firstNum, secondNum);

    }
}
