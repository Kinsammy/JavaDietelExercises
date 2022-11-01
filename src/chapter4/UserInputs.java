package chapter4;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputCounter = 1;
        while (true) {
            System.out.println("Enter from number 1-10: ");
            int number = input.nextInt();
            inputCounter++;

            }
    }
}
