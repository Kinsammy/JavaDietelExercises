package chapter6;

import java.security.SecureRandom;
//import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        for (int count = 1; count <= 20; count++) {
            int randomValue = 1 + randomNumber.nextInt(6);
            System.out.printf("%d ", randomValue);
            if (count % 5 == 0){
                System.out.println();
            }
        }
    }
}
