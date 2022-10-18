package chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximumValue = 0;
        int minimumValue = 0;
        int sum = 0;
        int counter = 1;
        System.out.print("Enter any integer value or enter any character to terminate the program: ");
        while (input.hasNextInt()){
            System.out.printf("Number %d: ", counter);
            int userInput = input.nextInt();
            if (userInput >= maximumValue){
                maximumValue = userInput;
            }
            if (minimumValue == 0 || userInput <= minimumValue){
                minimumValue = userInput;
            }
            sum = maximumValue + minimumValue;
            counter++;
        }
        System.out.printf("The Maximum integer is %d%n", maximumValue);
        System.out.printf("The Minimum integer is %d%n", minimumValue);
        System.out.printf("The Sum integer is %d", sum);
    }
}
