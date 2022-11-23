package chapter6;

import java.util.Scanner;

public class Multiples {
    public static void isMultiples(int firstNumber, int secondNumber) {
        if (firstNumber % secondNumber == 0){
            System.out.printf("%d is a multiple of %d", secondNumber, firstNumber);
        }
        else {
            System.out.printf("%d is not a multiple of %d", secondNumber, firstNumber);
        }
    }
}
