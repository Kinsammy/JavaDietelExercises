package classWork;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] userArray) {
        int[] reverseArray = new int[userArray.length];
        int forwardCounter = 0;
        for (int backwardounter = userArray.length -1; backwardounter != -1; backwardounter --){
            reverseArray[forwardCounter++] = userArray[backwardounter];
        }
        return reverseArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5})));

    }
}
