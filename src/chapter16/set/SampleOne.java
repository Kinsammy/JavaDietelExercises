package chapter16.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SampleOne {
    public static void main(String[] args) {
        Set<String>  states = new HashSet<>();
        states.add("Lagos");
        states.add("Abia");
        states.add("Bauchi");
        states.add("Zamfara");
        states.add("Borno");

        System.out.println("HashSet :: "+states);

        Set<String>  treeSet = new TreeSet<>();
        treeSet.add("Lagos");
        treeSet.add("Abia");
        treeSet.add("Bauchi");
        treeSet.add("Zamfara");
        treeSet.add("Borno");

        System.out.println("TreeSet:: "+treeSet);
    }
}
