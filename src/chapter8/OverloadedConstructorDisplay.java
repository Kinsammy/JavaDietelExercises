package chapter8;

public class OverloadedConstructorDisplay {
    public static void displayTime(String header, OverloadedConstructor time){
        System.out.printf("%s%n  %s%n  %s%n",
                header, time.toUniversalString(), time);
    }
}
