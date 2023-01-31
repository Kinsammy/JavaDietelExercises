package chapter16.mapSample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SampleOne {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Taye", 50);
        map.put("Shepherd", 40);
        map.put("Idowu", 30);

        System.out.println(map);
        Integer idowu = map.get("Idowu");
        System.out.println("Idowu -> " +idowu + " years");

        System.out.println(map.containsKey("Taye"));

        System.out.println(map.getOrDefault("Idowu", 30));

        Set<String> keys = map.keySet();
        System.out.println(keys);

        int result = map.replace("Idowu" , 79);
        System.out.println("New value:: " + result);

        System.out.println("size:: "+map.size());


    }
}
