package chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("Sam");
        Matcher matcher = pattern.matcher("Sam");
        System.out.println(matcher.matches());
    }
}
