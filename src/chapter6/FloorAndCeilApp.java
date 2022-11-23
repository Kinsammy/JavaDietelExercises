package chapter6;

import java.util.Scanner;

import static chapter6.FloorAndCeil.*;

public class FloorAndCeilApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = input.nextDouble();
        System.out.printf("The largest is %d%n", myFloor(number));
        System.out.printf("The smallest is %d", myCeil(number));

    }
}
