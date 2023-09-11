package chapter7;

import java.util.Arrays;

public class MultiInteger {
    public static void main(String[] args) {
        int[][]  numbers = new int[4][5];

        for (int row = 0; row < numbers.length; row++){
            for (int column = 0; column < numbers[row].length; column++){
                System.out.printf(" %d          " ,numbers[row][column] += row + column );
            }
            System.out.println();
        }
    }
}
