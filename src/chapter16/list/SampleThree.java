package chapter16.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SampleThree {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Numbers before removeAll->" +numbers);
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);

        numbers.removeAll(set);
        System.out.println("Numbers after removeAll->" +numbers);
    }
}
