package classWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(isHappy(number));

    }

    public static boolean isHappy(int number) {
        List<Integer> result = new ArrayList<>();
        int sumOfSquare = number;

        while (!result.contains(sumOfSquare)) {
            result.add(sumOfSquare);
            number = sumOfSquare;
            sumOfSquare = 0;
            while (number != 0) {
                int remainder = number % 10;
                int square = remainder * remainder;
                sumOfSquare += square;
                number /= 10;
            }
            if (result.contains(sumOfSquare)) {
                System.out.println(number + " is not a happy number");
                return false;
            }
            if (sumOfSquare == 1) {
                System.out.println(number + " is not a happy number");
                return true;

            }
        }
        return true;
    }

}