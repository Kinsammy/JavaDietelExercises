package chapter6;

import java.util.Scanner;

import static chapter6.Hypotenuse.getHypotenuse;

public class HypotenuseApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first side: ");
        double firstSide = input.nextInt();
        System.out.println("Enter first side: ");
        double secondSide = input.nextInt();
        double hypotenuse = getHypotenuse(firstSide, secondSide);
        System.out.printf("The Hypotenuse is %.2f", hypotenuse);
    }

}
