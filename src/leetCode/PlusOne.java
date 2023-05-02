package leetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
       int[] digits = {9, 0,9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    private static int[] plusOne(int[] digits){
        int digitLength = digits.length;
        int end = digitLength - 1;
        digits[end] += 1;
        for (int i = end; i >= 0 ; i--){
            if (i != 0) {
                if (digits[i] >= 10) {
                    digits[i] = 0;
                    digits[i - 1] += 1;
                }
            }
             else {
                if (digits[i] >= 10) {
                 int[] result = new int[digitLength + 1];
                 result[0] = 1;
                 return result;
                }
            }
        }
        return digits;
    }
}
