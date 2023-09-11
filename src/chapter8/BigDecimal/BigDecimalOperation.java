package chapter8.BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        BigDecimal firstNumber= input.nextBigDecimal();

        System.out.print("Enter second Number: ");
        BigDecimal secondNumber= input.nextBigDecimal();

        BigDecimal sum = firstNumber.add(secondNumber);
        BigDecimal product = firstNumber.multiply(secondNumber);
        BigDecimal remainder = firstNumber.remainder(secondNumber);

        System.out.printf("The sum is: %s%nThe Product is: %s%nThe remainder is: %s", sum, product, remainder);


    }
}
