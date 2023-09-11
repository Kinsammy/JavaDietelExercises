package chapter4;

import java.util.Scanner;

public class StudentAnalyze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failure = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter number 1 for pass and number 2 for fail: ");
            int number = input.nextInt();
            if (number == 1){
                passes++;
            }
            else {
                failure++;
            }
        studentCounter ++;
        }
        System.out.println("Passed: " +passes);
        System.out.println("Failed: " +failure);

        if (passes > 8){
            System.out.println("You have a bonus!");
        }
    }
}
