package chapter17.streamAPI.intermediateOperation;

import java.util.stream.IntStream;

public class SumOfEven {
    public static void main(String[] args) {
        IntStream numbers = IntStream.rangeClosed(2, 20);
//        numbers.forEach((n -> System.out.println(n))); todo generate even number from 2-20
        int total = numbers.filter((n)-> n % 2 == 0).sum();
        System.out.println(total);

        int totalNumber = IntStream.rangeClosed(2, 40)
                .filter((n) -> n % 2 == 0)
                .sum();
        System.out.println("new sum:: "+totalNumber);
    }
}
