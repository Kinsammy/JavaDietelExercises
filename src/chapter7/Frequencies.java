package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class Frequencies {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        int[] numbers = new int[7];
        for (int roll = 1; roll < 1000; roll++){
            ++numbers[1 + randomNumber.nextInt(6)];
            System.out.println(Arrays.toString(numbers));
        }
        System.out.printf("%s%10s%n", "Face", "Frequency");
        for (int face = 1; face < numbers.length; face++){
            System.out.printf("%d%10d%n", face, numbers[face]);
        }

    }
}
