package chapter7;

public class SudokuGame {
    public static void main(String[] args) {
        int[][] elements = new int[9][9];
        for (int row = 0; row < elements.length; row++){
            for (int column = 0; column < elements[row].length; column++){
                elements[row][column] = row + column + 1;
                if (elements[row][column] > 9){
                    elements[row][column] -= 9;
                }
                System.out.printf("%d   ", elements[row][column]);
            }
            System.out.println();
        }
    }
}
