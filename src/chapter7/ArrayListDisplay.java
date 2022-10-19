package chapter7;

import java.util.ArrayList;

public class ArrayListDisplay {

    public static void display(ArrayList<String> items, String header){
        System.out.print(header);

        for (String item : items){
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}
