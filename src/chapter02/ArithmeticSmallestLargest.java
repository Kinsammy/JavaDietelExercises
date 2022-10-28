package chapter02;

import java.util.Scanner;
public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        int smallest;
        int largest;
        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        int product = firstNumber * secondNumber * thirdNumber;

        smallest = firstNumber;
        if(secondNumber < smallest)
            smallest = secondNumber;
        if (thirdNumber < smallest)
            smallest = thirdNumber;

        largest = firstNumber;
        if (secondNumber > largest)
            largest = secondNumber;
        if (thirdNumber > largest)
             largest = thirdNumber;

        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The product is %d%n", product);
        System.out.printf("The Smallest is %d%nThe Largest is %d ", smallest,largest);
    }
}
