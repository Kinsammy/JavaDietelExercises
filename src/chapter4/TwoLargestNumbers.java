package chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstLargest = 0;
        int secondLargest = 0;
        int counter = 0;
        int number = 0;


        while (counter <= 5){
            System.out.print("Enter the 10 numbers: ");
            number = input.nextInt();
            if(number > firstLargest){
                firstLargest = number;
            }
            counter++;
        }
        if (number < secondLargest){
            secondLargest = number;
        }
        System.out.printf("The First Largest number input is: %d%n", firstLargest);
        System.out.printf("The Second Largest number input is: %d%n", secondLargest);
    }
}
