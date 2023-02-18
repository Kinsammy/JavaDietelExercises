package kunaDataStructureAlgorithm.linearSearch;

import java.util.Arrays;

public class MultiDimensionalSearch {

    public static void main(String[] args) {
        int[][] lists = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };

        int target = 99;
        int element = search(lists, target);
        int[] index = indexSearch(lists, target);
        System.out.println("Element :: " + element + " is located in index " + Arrays.toString(index));
    }

    public static int[] indexSearch(int[][] lists, int target) {
        if (lists.length == 0){
            return new int[]{0, 0};
        }

        for (int row = 0; row < lists.length; row++) {
            for (int col = 0; col < lists[row].length; col++) {
                if (lists[row][col] == target){
                    return new int[]{row, col};
                }

            }

        }
        return new int[]{-1, -1};
    }

    public static int search(int[][] lists, int target) {
        if (lists.length == 0){
            return 0;
        }

        for (int row = 0; row < lists.length; row++) {
            for (int col = 0; col < lists[row].length; col++) {
                if (lists[row][col] == target){
                    return lists[row][col];
                }

            }

        }
        return -1;
    }



}
