package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Elimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] uniqueNumbers = {0};
        int uniqueCounter  = 0;
        Arrays.fill(numbers, -1);
        System.out.println("Enter number between 10 and 100: ");
        for (int counter = 0; counter < numbers.length; counter++){
            int number = input.nextInt();
            if (number >= 10 && number <= 100) {
                numbers[counter] += number;
            }

            boolean isDuplicate = false;
            for (int i : numbers) {
                if (numbers[counter] == i) {
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate){
                uniqueNumbers[uniqueCounter++] = numbers[counter];
            }
        }



        System.out.print(Arrays.toString(uniqueNumbers));
    }

//    private static boolean isDuplicate(int[] numbers){
//
//
//    }
}
