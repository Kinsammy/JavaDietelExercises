package chapter4;

import  java.util.Scanner;
public class SentinelClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
        // this loop till the sentinel value is input
        while (grade != -1){
            total += grade;
            gradeCounter ++;

            // if the input grade is not -1
            // repeat the input grade
            // until value -1 to quit
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        // This statement is when a user input grade
        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grades enter is %d%n", gradeCounter, total);
            System.out.printf("The average is %.2f%n", average);
        }
        else { // This statement is if the is less than 0
            System.out.println("No grade were entered");
        }
    }
}
