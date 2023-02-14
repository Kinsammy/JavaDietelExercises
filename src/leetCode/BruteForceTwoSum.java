package leetCode;

//Todo Loop through each element in nums
// and then loop through each element again with row against the length
// to find if there is a value that equals target - nums[i]
import java.util.Arrays;

public class BruteForceTwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,5,9};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }
        public static int[] twoSum(int[] nums, int target){
            for (int i = 0; i < nums.length ; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target){
                        return new int[]{i, j};
                    }
                }

            }
            return nums;
        }
}
