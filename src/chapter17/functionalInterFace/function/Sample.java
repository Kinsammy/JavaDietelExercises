package chapter17.functionalInterFace.function;

import java.util.function.Function;

public class Sample {
    public static void main(String[] args) {
        Function<String, Integer> function = (name) -> name.length();
        System.out.println("The Length:: "+function.apply("Sam"));
    }
}
