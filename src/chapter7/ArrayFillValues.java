package chapter7;

import java.util.Arrays;

public class ArrayFillValues {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int counter = 1; counter < 10; counter++){
            numbers[counter] += counter;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
