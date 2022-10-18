package chapter4;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputCounter = 1;
        System.out.println("Enter from number 1-10: ");
        int number = input.nextInt();
        while (number == 1) {
            number ++;
        inputCounter++;
            System.out.println("Enter from number 1-10: ");
            number = input.nextInt();


            }
    }
}
