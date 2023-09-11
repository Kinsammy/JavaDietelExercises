package chapter7;

import java.util.Arrays;

public class MultiCharArray {
    public static void main(String[] args) {
        char[][] letters = {{'X', 'O', 'X', 'O'}, {'X', 'O', 'X'}, {'X', 'X', 'O'}};
        for(int row = 0; row < letters.length; row++){
            for (int column = 0; column < letters[row].length; column++){
                System.out.printf("%c   ",letters[row][column]);
            }
            System.out.println();
        }
    }
}
