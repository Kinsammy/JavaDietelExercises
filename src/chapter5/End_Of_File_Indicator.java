package chapter5;

import java.util.Scanner;

public class End_Of_File_Indicator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int fail = 0;
        int counter = 1;

        System.out.print("Enter any integer value to start this program " +
                "or enter any character apart from whole number to output" +
                " or enter any character apart from whole number if no grade: ");
        while (input.hasNextInt()){
            System.out.printf("Grade %d: ", counter);
            int grade = input.nextInt();
            if (grade >= 90 && grade<=100 ){
                aCount++;
            } else if (grade >= 80 && grade <= 89) {
                bCount++;
            } else if (grade >= 60 && grade <= 79) {
                cCount++;
            }
            else {
                fail++;
            }
            total += grade;
            counter++;
        }
        if (counter != 0) {
            double average = (double) total / counter;
            System.out.printf("Total grade A = %d%n",aCount);
            System.out.printf("Total grade B = %d%n",bCount);
            System.out.printf("Total grade C = %d%n",cCount);
            System.out.printf("Total grade F = %d%n",fail);
            System.out.printf("The Total grades =%d%nAverage of %d students is %.2f%n", total, counter, average);
        }
        else {
            System.out.println("No grades were enter.");
        }
    }
}
