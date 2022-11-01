package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Elimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        Arrays.fill(numbers, -1);
        for (int counter = 0; counter < numbers.length; counter++){
            System.out.print("Enter number between 10 and 100: ");
            int number = input.nextInt();
            if (number >= 10 && number <= 100) {
                numbers[counter] = number;
            }
        }

        System.out.print(Arrays.toString(numbers));
    }
}
