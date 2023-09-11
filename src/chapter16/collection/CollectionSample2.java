package chapter16.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionSample2 {
    public static void main(String[] args) {
        Collection<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);


        Collection<Integer> secondList = new ArrayList<>();
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);
        secondList.add(8);

        System.out.println("Elements in list:: " + firstList);
        System.out.println("Elements in list:: " + secondList);
        System.out.println("Adding elements of firstList to secondList");

        firstList.addAll(secondList);

        System.out.println("Element in the first list::" + firstList);

        Iterator<Integer> numberIterator = firstList.iterator();

        while (numberIterator.hasNext()){
            System.out.println(numberIterator.next());
        }
     }
}
