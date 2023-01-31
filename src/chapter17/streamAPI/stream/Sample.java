package chapter17.streamAPI.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.stream().forEach(n -> System.out.println(n));

//        Stream<Integer> stream = numbers.stream();
//        Consumer<Integer> consumer =
//                (number) -> System.out.println(numbers);
//        stream.forEach(consumer);
    }
}
