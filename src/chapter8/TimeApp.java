package chapter8;

import static chapter8.TimeDisplay.displayTime;

public class TimeApp {
    public static void main(String[] args) {
        Time time  = new Time(13, 27, 6);

        displayTime("After time object is created", time);
        System.out.println();
        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);
        
    }
}
