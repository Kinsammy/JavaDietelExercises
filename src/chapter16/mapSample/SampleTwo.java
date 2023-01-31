package chapter16.mapSample;

import java.util.Map;

public class SampleTwo {
    public static void main(String[] args) {

        Map<String, Integer> calender = Map.of(
                "January", 31,
                "February", 28,
                "March", 31,
                "April", 30,
                "May",31
        );

        System.out.println(calender);

    }
}
