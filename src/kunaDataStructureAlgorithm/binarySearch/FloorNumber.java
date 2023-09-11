package kunaDataStructureAlgorithm.binarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int floorNum = floorNumber(numbers, target);
        System.out.printf("The floor number is in index %s ", floorNum);
    }

    private static int floorNumber(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
//  todo --> return the index of greatest number  that is <= target
        if (target < start){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < numbers[mid]){
                end = mid - 1;
            } else if (target > numbers[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
