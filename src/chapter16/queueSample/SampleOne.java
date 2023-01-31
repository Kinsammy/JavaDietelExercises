package chapter16.queueSample;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SampleOne {
    public static void main(String[] args) {

        Queue<String> fillStation = new PriorityQueue<>();
        fillStation.offer("Total");
        fillStation.offer("Oando");
        fillStation.offer("AP");
        fillStation.offer("Mobile");
        fillStation.poll();

        System.out.println(fillStation.peek());
        System.out.println(fillStation);

        Iterator<String> iterator = fillStation.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
