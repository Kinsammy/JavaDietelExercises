package sketchPad;

import java.util.Arrays;

public class SketchPad {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        numbers[1][0] = 1;
        numbers[2][4] = 1;
        numbers[2][2] = 1;
        numbers[4][3] = 1;

        for (int row = 0;  row < numbers.length; row++){
            for (int column = 0; column < numbers[row].length; column++){
                if (numbers[row][column] == 1){
                    System.out.print("*" + "  ");
                }
                else {
                    System.out.print(" "+ "  ");
                }
            }
            System.out.println();
        }

//        for (int[] row : numbers){
//            for (int column : row){
//                System.out.println(Arrays.toString(numbers[column]));
//            }
//        }

    }
}
