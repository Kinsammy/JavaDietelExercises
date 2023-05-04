package chapter16.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
    public static void main(String[] args) {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        List<String> lists = Arrays.asList(suits);
        System.out.printf("%nUnsorted Lists: %s%n", lists);
        Collections.sort(lists);
        System.out.printf("%nSorted List Ascending Order: %s", lists);
        lists.sort(Collections.reverseOrder());
        System.out.printf("%nSorted List Descending Order: %s", lists);

    }
}
