package chapter17.functionalInterFace.binaryOperator;

import java.util.function.BinaryOperator;

public class Sample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator =
                (name, word) -> name+word;

        System.out.println(binaryOperator.apply("Semicolon ", "Native"));
    }
}
