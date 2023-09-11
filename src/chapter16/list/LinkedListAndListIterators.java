package chapter16.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListAndListIterators {
    public static void main(String[] args) {
        String[] firstColors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> firstList = new LinkedList<>();

        for (String color : firstColors){
            firstList.add(color);
        }

        String[] secondColors = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> secondList = new LinkedList<>();
        for (String color : secondColors){
            secondList.add(color);
        }

        firstList.addAll(secondList);
        printList(firstList);

        convertToUppercaseStrings(firstList);
        printList(firstList);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(firstList, 4, 7);

        printList(firstList);
        printReversedList(firstList);
    }


    private static void printList(List<String> colors){
        System.out.printf("%nRemaining list:%n");

        for (String color: colors){
            System.out.printf("%s ", color);
        }
        System.out.println();
    }

    private static void convertToUppercaseStrings(List<String> colors){
        ListIterator<String> iterator = colors.listIterator();

        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> colors, int start, int end){
        colors.subList(start, end).clear();
    }

    private static void printReversedList(List<String> colors){
        ListIterator<String> iterator = colors.listIterator(colors.size());

        System.out.printf("%nReversed List:%n");
        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }


}
