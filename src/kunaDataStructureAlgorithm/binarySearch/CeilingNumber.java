package kunaDataStructureAlgorithm.binarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 22;
        int ceilingNum = ceilingNumber(numbers, target);
        System.out.printf("The Ceiling number is in index %d", ceilingNum);
    }

    static int ceilingNumber(int[] numbers, int target){
        int start = 0;
        int end = numbers.length - 1;
// todo -> if the target is greater than the greatest number in the array
        if (target > end || target < start){
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
        return start;
    }
}
