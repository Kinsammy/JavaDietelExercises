package kunaDataStructureAlgorithm.linearSearch;

public class LinearSearch {
    public static void main(String[] args){
        int[] numbers = {3,13, 8, 9, 7, 12, 9, 2, 1};
        int target = 0;
        int answer = linearSearch(numbers, target);


    }

    public static int linearSearch(int[] numbers, int target) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target){
                return index;
            }

        }
        return -1;
    }

    public static int elementLinearSearch(int[] numbers, int target) {
        for (int number : numbers) {
            if (number == target) {
                return number;
            }

        }
        return -1;
    }
}
