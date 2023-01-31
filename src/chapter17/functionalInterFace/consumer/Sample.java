package chapter17.functionalInterFace.consumer;

import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer number) -> System.out.println("Number passed to accept:: " + number);
        consumer.accept(1);
    }
}
