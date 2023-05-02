package dsaClass;

import java.util.Arrays;

public class SlideWindow {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 12, 13, 2, 1, 0};
        int range = 3;
        System.out.println(slidingWindow(numbers, range));
        System.out.println(subArray(numbers, range));
    }

    private static int slidingWindow(int[] nums, int range){
        int end = nums.length - range + 1;
        int max = 0;

        for(int i = 0; i < end; i ++){
            int sum = nums[i];

            for (int j = 1; j < range; j++){
                sum +=nums[j];
            }
            if (sum > max){
                max = sum;
            }

        }
        return max;
    }

    private static int subArray(int[] nums,   int range){
        int max = 0;
        int sum = 0;

        for (int index = 0; index< range; index++){
           
        }
        for (int i = range; i < nums.length; i++){
            if (i <= range){
                sum +=nums[i];
                sum +=nums[i] - nums[i-range];

                if (sum > max){
                    max = sum;
                }
            }
        }
        return sum;
    }
}
