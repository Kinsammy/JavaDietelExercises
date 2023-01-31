package chapter17.functionalInterFace.unaryOperator;

import java.util.function.UnaryOperator;

public class Sample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator =
                (name)-> String.valueOf(name.length());
        System.out.println(unaryOperator.apply("Sam"));
    }
}
