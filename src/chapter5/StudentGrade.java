package chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner gradeInput = new Scanner(System.in);
        int grade_A_Counter = 0;
        int grade_B_Counter = 0;
        int grade_C_Counter = 0;
        int grade_D_Counter = 0;

        for (int gradeCounter = 1; gradeCounter <= 5; gradeCounter++) {
            System.out.print("Enter Student Name: ");
            String name = input.nextLine();
            System.out.print("Enter Student Letter grade: ");
            char letterGrade = gradeInput.next().charAt(0);
            switch (letterGrade) {
                case 'A' -> grade_A_Counter++;
                case 'B' -> grade_B_Counter++;
                case 'C' -> grade_C_Counter++;
                default -> grade_D_Counter++;
            }
        }

        System.out.printf("students got a grade of ‘A’ is %s%n", grade_A_Counter);
        System.out.printf("students got a grade of ‘B’ is %s%n", grade_B_Counter);
        System.out.printf("students got a grade of ‘C’ is %s%n", grade_C_Counter);
        System.out.printf("students got a grade of ‘D’ is %s%n", grade_D_Counter);
    }
}