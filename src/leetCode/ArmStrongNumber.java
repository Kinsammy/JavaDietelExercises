package leetCode;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number to check if it is an Armstrong number or not:: ");
//        int number = scanner.nextInt();
//        boolean answer = isArmStrong(number);
//        System.out.println(answer);
        for (int index = 1; index <=1000 ; index++) {
            if (isArmStrong(index)){
                System.out.println(index);
            }
        }
    }

    private static boolean isArmStrong(int number){
        int originalNumber = number;
        int newNumber = 0;
        while (number > 0){
            int rem = number % 10;
            int cubeOfNumber = (int) Math.pow(rem, 3);
            newNumber += cubeOfNumber;
            number /= 10;

        }
        return newNumber == originalNumber;
    }
}
