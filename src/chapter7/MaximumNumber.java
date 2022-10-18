package chapter7;

import java.security.SecureRandom;
public class MaximumNumber {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        double[] c = new double[120];
        double maximum = c[0];
        for (int index = 0; index < c.length; index++){
            int random = 1 + randomNumber.nextInt(100);

            c[index] = random;
        }
        for (double number : c) {
            System.out.println(number);
        }

        for (int count = 0; count < 100; count++){
            if (c[count] > maximum) {
                maximum = c[count];
            }

        }
        System.out.printf("The Maximum is: %.1f%n", maximum);

    }
}
