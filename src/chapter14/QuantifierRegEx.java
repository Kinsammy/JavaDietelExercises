package chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierRegEx {
    public static void main(String[] args) {

        Pattern  pattern = Pattern.compile("e.+d");
        Pattern  scope = Pattern.compile("e.+?d");
        Matcher matcher = pattern.matcher("endangered species wil end up dead");
        Matcher match = scope.matcher("endangered species wil end up dead");

        while (matcher.find()) {
            System.out.println("matched -> " +matcher.group());
        }

        while (match.find()) {
            System.out.println("matched by select-> " +match.group());
        }
    }
}
