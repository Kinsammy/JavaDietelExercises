package chapter7;

public class MultiArraySum {
    public static void main(String[] args) {
        multiSum(new int[][]{{1, 2, 3, 4}, {5, 6, 7},{10},{9, 8 , 7}});

    }

    public static void multiSum(int[][] arrays){
        int total = 0;

        for (int row = 0; row < arrays.length; row++){
            for (int column = 0; column < arrays[row].length; column++){
                total += arrays[row][column];
                System.out.printf("%n%d   ", total);
            }
            System.out.println();
        }
        System.out.printf("The total elements are %d%n", total);
    }

}
