package chapter7;

import java.util.ArrayList;

import static chapter7.ArrayListDisplay.display;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("red");
        items.add(0, "yellow");

        // header
        System.out.print(
                "Display list contents with counter-controlled loop:");

        // display the colors in the list
        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }

        // display colors using enhanced for in the display method
        display(items, "\nDisplay list contents with enhanced for statement:");
        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements:");

        items.remove("yellow");
        display(items, "Remove first yellow: ");
        items.remove(1);
        display(items, "remove first instance of yellow: ");

        // check if a value is in the list
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");

        //display number of elements in the list
        System.out.printf("Size: %s%n", items.size());

    }
}
