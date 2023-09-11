package chapter17.streamAPI.intermediateOperation;

import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,52,4,33,52,8, 1, 7, 8,9);
        System.out.println("Before::" +number);
        System.out.println("After:: " +number.stream().distinct()
                .sorted()
                .collect(Collectors.toList()));
    }
}
