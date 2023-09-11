package chapter16;

import java.util.HashMap;
import java.util.Iterator;

public class States {
    public static void main(String[] args) {
        HashMap<String, String> states = new HashMap<>();

        states.put("England", "London");
        states.put("Germany", "Berlin");
        states.put("Norway", "Oslo");
        states.put("USA", "Washington DC");

//        for (String state: states.keySet()){
//            System.out.println(state);
//        }
//        System.out.println();
//        for (String state: states.values()){
//            System.out.println(state);
//        }

        Iterator<String> iterator = states.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
