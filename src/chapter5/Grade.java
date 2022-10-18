package chapter5;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for(  int count = 1; count <= 5; count++){
            System.out.print("Enter student grade: ");
            char grade = input.next().charAt(0);
            switch (grade){
                case 'A', 'a' -> {
                    System.out.println("Grade A");
                    aCount++;
                }
                case 'B', 'b' -> {
                    System.out.println("Grade B");
                    bCount++;
                }
            }
        }

        System.out.printf("Grade A result: %d", aCount);
        System.out.printf("Grade B result: %d", bCount);
    }
}
