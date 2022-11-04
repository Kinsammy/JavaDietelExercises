package chapter8;

public class TimeDisplay {
    public static void displayTime(String header, Time time){
        System.out.printf("%s%nUniversal Time: %s%nStandard Time: %s%n", header, time.toUniversalString(), time.toString());
    }
}
