package chapter11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        while (true){
            System.out.print("Enter numerator value: ");
            int numerator = input.nextInt();
            System.out.print("Enter denominator value: ");
            int denominator = input.nextInt();
            try {
                result = quotient(numerator, denominator);

            } catch (ArithmeticException e){
                System.out.println("You have divide a numerator by Zero(0)");
            }

            catch (InputMismatchException e){
                input.nextLine();
                System.err.println("you enter a String instead of number." + e.getMessage());
            }
        }
    }

    public static int quotient(int numerator, int denominator){
        if (denominator == 0){
            throw new ArithmeticException("You are dividing numerator by zero!");
        }
        return numerator / denominator;
    }
}
