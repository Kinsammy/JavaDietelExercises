package kunaDataStructureAlgorithm.linearSearch;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] numbers = {18, 12, -7, 3, 14, 28};
        int target = 3;
        int start = 1;
        int end = 4;
        System.out.println(Arrays.toString(numbers));
        int element = rangeSearch(numbers, target, start, end);
        System.out.println("The target is located in index:: "+element);
    }

    public static int rangeSearch(int[] numbers, int target, int start, int end) {
        if (numbers.length == 0){
            return 0;
        }

        for (int index = start; index <= end; index++) {
            if (numbers[index] == target){
                return index;
            }
        }
        return -1;
    }
}
