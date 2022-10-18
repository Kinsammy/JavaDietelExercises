package chapter4;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int larger = 0;
        int largest = 0;

        int counter = 0;
        while (counter != 5) {
            System.out.print("Enter a value: ");
            int value = input.nextInt();
            counter++;

            if (value > largest) {
                larger = largest;
                largest = value;
            }

            if (value < largest) {
                if (value > larger) {
                    larger = value;
                }
            }
        }
        System.out.printf("The larger value is %d, and the largest value is %d", larger, largest);

    }
}


