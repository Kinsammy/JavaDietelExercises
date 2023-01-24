package chapter16.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionConversion {
    public static void main(String[] args) {

        Collection<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);

        Integer[] numberArray  = new Integer[4];
        firstList.toArray(numberArray);
        System.out.println("Array of numbers::  " + Arrays.toString(numberArray));
    }
}
