package chapter17.streamAPI.intermediateOperation;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        Set<Integer> numbers  = Set.of(100, 3, 40, 5, 1, 7, 90, 2);
        List<Integer> numberList = numbers.stream()
                                          .sorted()
                                            .collect(Collectors.toList());
        System.out.println(numberList);
    }
}
