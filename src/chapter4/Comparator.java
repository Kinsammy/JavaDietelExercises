package chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();
        if (firstNumber == secondNumber){
            System.out.println(0);
        } else if (firstNumber > 1) {
            System.out.print(1);
        }
        else {
            System.out.print(-1);
        }

    }
}
