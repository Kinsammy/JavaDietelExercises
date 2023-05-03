package chapter16.list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class ConvertingListToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red");
        links.add("pink");
        links.add(3, "green");
        links.addFirst("cyan");

        colors = links.toArray(new String[links.size()]);
        System.out.println("colors: ");

        System.out.println(Arrays.toString(colors));
        for (String color : colors){
            System.out.println(color);
        }
    }
}
