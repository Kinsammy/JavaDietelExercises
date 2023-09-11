package chapter6;

import java.util.Scanner;

import static chapter6.SquareOfAsterisks.*;

public class SquareOfAsterisksApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row side you need: ");
        int rowSide = input.nextInt();
        System.out.println("Enter the column side you need: ");
        int columnSide = input.nextInt();
        System.out.println("The square Asterisk with one parameters");
        System.out.println(squareOfAsterisks(rowSide));
        System.out.println("The Modify with two parameters");
        System.out.println(squareOfAsterisksModify(rowSide, columnSide));
    }

}
