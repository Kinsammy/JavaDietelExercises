package kunaDataStructureAlgorithm.binarySearch;


public class NumberSearch {
    public static void main(String[] args) {
        int[] numbers = {-18, -6, -2, 0, 2, 6, 8, 11, 18, 22, 36, 43};
        int target = 36;
        int search = binarySearch(numbers, target);
        System.out.printf("The target number is in index %d", search);

    }
    public static int binarySearch(int[] numbers, int target){
        int start = 0;
        int end = numbers.length;

        while (start <= end){
            int middleNumber = start + (end - start) / 2;
            if (target < numbers[middleNumber]){
                end = middleNumber - 1;
            } else if (target > numbers[middleNumber]){
                start = middleNumber + 1;
            } else {
                return middleNumber;
            }
        }
        return -1;
    }

}
