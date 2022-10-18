package chapter7;

//import java.security.SecureRandom;
public class Exercise7_8Max {
    public static void main(String[] args) {
//        SecureRandom randomNumber = new SecureRandom();
//
        int[] numbers = new int[100];
        int max = numbers[0];
        for (int counter =0; counter < numbers.length; counter++){

            if (numbers[counter] > max)
                max = numbers[counter];
        }

        System.out.println(max);
    }
}
