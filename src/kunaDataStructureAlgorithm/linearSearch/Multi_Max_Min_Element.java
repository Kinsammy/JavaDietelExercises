package kunaDataStructureAlgorithm.linearSearch;

public class Multi_Max_Min_Element {
    public static void main(String[] args) {
        int[][] lists = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 99;
        int maxValue = maxElement(lists, target);
        System.out.println(maxValue);
    }


    public static int maxElement(int[][] numbers, int target) {
        if (numbers.length == 0 ){
            return  0;
        }

        int maxValue = numbers[0][0];
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] > maxValue){
                    maxValue = numbers[row][col];
                }
            }

        }
        return maxValue;
    }

    public static int minElement(int[][] numbers, int target) {
        if (numbers.length == 0 ){
            return  0;
        }

        int minValue = numbers[0][0];
        for (int[] number : numbers) {
            for (int i : number) {
                if (i < minValue) {
                    minValue = i;
                }
            }

        }
        return minValue;
    }
}
