package chapter7;

public class MultiInitArray {
    public static void main(String[] args) {

        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}};
        int[][] secondArray = {{1, 2},{3}, {4, 5, 6}};

        System.out.println("The Values in first array by row are");
        outputArray(firstArray);
        System.out.println("The Values in second array by row are");
        outputArray(secondArray);
    }

    public static void outputArray(int[][] arrays){

        for (int row = 0; row < arrays.length; row++){
            for (int column = 0; column < arrays[row].length; column++){
                System.out.printf("%d   ", arrays[row][column]);
            }
            System.out.println();
        }
    }
}
