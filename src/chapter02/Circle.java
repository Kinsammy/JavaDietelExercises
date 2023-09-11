package chapter02;

import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for Radius: ");
        int radius = input.nextInt();
        int diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("The diameter of the Circle is %d%n", diameter);
        System.out.printf("The Circumference of the Circle is %.1f%n", circumference);
        System.out.printf("The Area of the Circle is %.2f%n", area);
    }
}
