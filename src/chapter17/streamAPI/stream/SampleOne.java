package chapter17.streamAPI.stream;

import java.util.Random;
import java.util.stream.Stream;

public class SampleOne {
    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
//        stream.forEach(n -> System.out.println(n));
//
//        Stream<Integer> emptyStream = Stream.empty();
//        emptyStream.forEach((n) -> System.out.println(n));

        Stream<Integer> numbers = Stream.generate(()-> new Random().nextInt(10)).limit(7);
        numbers.forEach((n) -> System.out.println(n));
    }
}
