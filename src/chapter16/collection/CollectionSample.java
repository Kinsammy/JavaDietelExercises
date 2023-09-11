package chapter16.collection;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Semicolon");
        words.add("Batified");
        words.add("Obidients");
        words.add("Atikulate");

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("The min::" +Collections.min(numbers));
        System.out.println("The max::" +Collections.max(numbers));


    }
}
