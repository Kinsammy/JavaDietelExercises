package chapter02;

import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest;
        int smallest;

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        System.out.print("Enter fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.print("Enter fifth number: ");
        int fifthNumber = input.nextInt();

        largest = firstNumber;
        smallest = firstNumber;
        if (secondNumber > largest)
        largest = secondNumber;
        if (thirdNumber > largest)
        largest = thirdNumber;
        if (fourthNumber > largest)
        largest = fourthNumber;
        if (fifthNumber > largest)
        largest = fifthNumber;

        if (secondNumber < smallest)
            smallest = secondNumber;
        if (secondNumber < smallest)
            smallest = thirdNumber;
        if (thirdNumber < smallest)
            smallest = thirdNumber;
        if (fourthNumber < smallest)
            smallest = fourthNumber;
        if (fifthNumber < smallest)
            smallest=fifthNumber;

        System.out.printf("The largest  number is %d%nThe smallest number%d%n ",
                largest, smallest);
    }
}
