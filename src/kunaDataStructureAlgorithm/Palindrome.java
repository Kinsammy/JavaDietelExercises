package kunaDataStructureAlgorithm;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to know if it is a Palindrome Number or not ");
        int number = input.nextInt();
         palindromeNumber(number);
    }

    private static void palindromeNumber(int number) {
        int temp = number;
        int reverseNumber = 0;
        while (number > 0){
            int rem = number % 10;
            reverseNumber = reverseNumber *10 + rem;
            number /= 10;
        }
        if (reverseNumber == temp){
            System.out.printf("%d is a Palindrome Number!", temp);
        }
        else {
            System.out.printf("%d is not a Palindrome Number!", temp);
        }
    }
}
