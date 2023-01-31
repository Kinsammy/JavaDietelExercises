package chapter17.functionalInterFace.biConsumer;

import java.util.function.BiConsumer;

public class Sample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer =
                    Sample::extracted;

        biConsumer.accept("Samuel", 3);
    }

    private static void extracted(String name, Integer age) {
        System.out.println("Let do it together");
        System.out.println("Java class end on 26/Jan/2023");
        System.out.println(name + " is " + age + " years old");
    }
}
