package chapter16.list;

import java.util.Arrays;
import java.util.List;

public class SampleSix {
    public static void main(String[] args) {
        Integer[] numbers = {1,2, 3 , 4, 5, 6, 7, 8};
        List<Integer> nums = Arrays.asList(numbers);
        System.out.println(nums);
        nums.add(25);
        System.out.println("Size:: "+nums.size());

    }
}
