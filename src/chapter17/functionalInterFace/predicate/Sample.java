package chapter17.functionalInterFace.predicate;

import java.util.function.Predicate;

public class Sample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word) ->  word.length() > 3;

        predicate.test("Semicolon");
    }
}
