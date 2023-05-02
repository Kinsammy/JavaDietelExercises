package leetCode;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,4,3,2,1};
        int mid = midElement(numbers);
        System.out.println(Arrays.toString(shuffleArray(numbers, mid)));
    }

    private static int[] shuffleArray(int[] nums, int mid){
        int numsLength = nums.length;
        int[] result = new int[numsLength];
        mid = midElement(nums);
        int numsIndex = 0;

        for (int i = 0; i < mid; i++){
            result[numsIndex++] += nums[i];
            result[numsIndex++] += nums[mid + i];
        }
        return result;
    }

    private static int midElement(int[] nums){
      return nums.length / 2;
    }
}
