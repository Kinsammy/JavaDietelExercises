package chapter14;

import java.util.Arrays;

public class ExampleTwo {
    public static void main(String[] args) {
        char[] chars = new char[20];
        String string = new String("Semicolon africa");
        string.getChars(2,9, chars, 11);

        System.out.println(Arrays.toString(chars));
    }
}
