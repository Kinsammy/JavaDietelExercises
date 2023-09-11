package chapter17.streamAPI.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SampleTwo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(numbers.stream()
                .map(number -> number * number)
                .map(number -> number * number)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }
}
