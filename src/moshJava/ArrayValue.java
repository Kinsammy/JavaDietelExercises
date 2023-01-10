package moshJava;

import java.sql.Array;
import java.util.Arrays;

public class ArrayValue {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.printf("%5s%8s%n", "index", "value");
        for (int index = 0; index < numbers.length; index++){
            System.out.printf("%5d%8d%n", index, numbers[index]);
        }
    }
}
