package chapter8;

import static chapter8.OverloadedConstructorDisplay.displayTime;

public class OverloadedConstructorApp {
    public static void main(String[] args) {
OverloadedConstructor time = new OverloadedConstructor();
        OverloadedConstructor time1 = new OverloadedConstructor(2);
        OverloadedConstructor time2 = new OverloadedConstructor(21, 34);
        OverloadedConstructor time3 = new OverloadedConstructor(12, 25, 42);
        OverloadedConstructor time4 = new OverloadedConstructor(time3);

        System.out.println("Constructor with:");
        displayTime("time: default constructor",  time);
        displayTime("time1: hour specified: default minute and second", time1);
        displayTime("time2:  hour and minute specified; default second", time2);
        displayTime("time3: hour, minute and second specified", time3);
        displayTime("Time4: Time1 object time3 specified", time4);

        try {
            OverloadedConstructor time5 = new OverloadedConstructor(27, 74, 99); // invalid values
        }
        catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing time5: %s%n",
                    e.getMessage());
        }

    }

 }
