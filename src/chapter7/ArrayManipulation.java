package chapter7;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndouble Array: ");
        for (double value : doubleArray){
            System.out.printf("%.1f ", value);
        }

        int[] fillArray = new int[10];
        Arrays.fill(fillArray, 2);
        
    }
}
