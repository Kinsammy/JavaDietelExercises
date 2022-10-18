package chapter7;

import java.security.SecureRandom;
public class Exercise7_8e {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int[] w = new int[100];
        int product = 0;
        for (int index = 0; index < w.length; index++){
            int numbers = 1 + randomNumber.nextInt(100);
            w[index] = numbers;
        }
        for (int number : w){
            System.out.println(number);
        }
        for (int count = 3; count <= 10; count++){
            product = w[count] * count;
        }
        System.out.printf("The products of the numbers is: %d%n", product);
    }
}
