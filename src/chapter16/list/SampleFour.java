package chapter16.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SampleFour {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Numbers before sorting->" +numbers);

//        Comparator<Integer> comparator = (a, b) -> b- a;

        numbers.sort(Comparator.naturalOrder());
        System.out.println("Numbers after sorting in order->" +numbers);

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Numbers after sorting in reverse order->" +numbers);


    }
}
