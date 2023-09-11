package chapter17.functionalInterFace.biFunction;

import java.util.function.BiFunction;

public class Sample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction =
                (word, number)-> word.length() == number;
        System.out.println(biFunction.apply("Sam", 2));
    }
}
