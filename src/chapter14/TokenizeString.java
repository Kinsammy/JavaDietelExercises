package chapter14;

import java.util.Arrays;

public class TokenizeString {
    public static void main(String[] args) {
        String text = "I am Software Engineer!";
        String[] tokens = text.split(" ");
        System.out.println(Arrays.toString(tokens));
    }
}
