package chapter16.list;

import java.util.Collections;
import java.util.List;

public class SampleFive {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>(Collections.singletonList(1));
        list.add(56);
        System.out.println(list);
    }
}
