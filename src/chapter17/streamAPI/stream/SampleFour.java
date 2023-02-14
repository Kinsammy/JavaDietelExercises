package chapter17.streamAPI.stream;

import java.util.List;

public class SampleFour {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(numbers.stream()
                .reduce(0, (x, y) -> x + y));
    }
}
