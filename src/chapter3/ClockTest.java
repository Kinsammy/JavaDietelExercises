package chapter3;

public class ClockTest {
    public static void main(String[] args) {
        Clock newTime = new Clock(3,8,3);

        System.out.printf("The time is %d:%d:%d%n",newTime.getHour(), newTime.getMinute(),newTime.getSecond());

        newTime.setHour(2);
        newTime.setMinute(6);
        newTime.setSecond(4);
        System.out.printf("%d", newTime.displayTime());
    }
}
