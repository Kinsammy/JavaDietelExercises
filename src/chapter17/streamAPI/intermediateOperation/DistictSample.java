package chapter17.streamAPI.intermediateOperation;

import java.util.List;
import java.util.stream.Collectors;

public class DistictSample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 5, 7, 3, 4, 8, 89, 32, 54, 100, -1, 0);
        System.out.println(
                numbers.stream()
                        .distinct()
                        .collect(Collectors.toList()));
    }
}
