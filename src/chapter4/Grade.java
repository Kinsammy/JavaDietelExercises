package chapter4;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        while (gradeCounter <= 10){
            System.out.print("Enter your student grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }
        int average = total / 10;

        System.out.printf("The total score gor 10 student is %d%n", total);
        System.out.printf("The average is %d%n", average);
    }
}
