package chapter17.functionalInterFace.biPredicate;

import java.util.function.BiPredicate;

public class Sample {
    public static void main(String[] args) {

        BiPredicate<String, Integer> biPredicate =
                (word, number) -> word.length() == number;

        System.out.println(biPredicate.test("Semicolon", 9));
    }
}
