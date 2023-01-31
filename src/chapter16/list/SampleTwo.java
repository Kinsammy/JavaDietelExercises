// todo indexOf()
// todo lastIndexOf
// todo Iterator<>, ListIterator<>, SplitIterator<>

package chapter16.list;

import javax.lang.model.type.IntersectionType;
import java.util.*;

public class SampleTwo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Index of element 3 in numbers -> "+numbers.indexOf(3));
        System.out.println("Last index of element 3 in numbers -> "+numbers.lastIndexOf(3));

//        Iterator<Integer> numberIterator = numbers.iterator();
//
//        while (numberIterator.hasNext()){
//            System.out.println(numberIterator.next());
//            numberIterator.remove();
//            System.out.println("Iterator::"+numbers);
//        }

//        ListIterator<Integer> numberIterator1 = numbers.listIterator(7);
//        while (numberIterator1.hasPrevious()){
//            System.out.println(numberIterator1.previous());
//            numberIterator1.remove();
//            System.out.println("Iterator::"+numbers);
//        }

        Spliterator<Integer> spliterator = numbers.spliterator();
        var spliterator1 = spliterator.trySplit();
        System.out.println("numbers -> " +spliterator1.estimateSize());
        spliterator.forEachRemaining(System.out::println);
//    It also work like the above function -> spliterator.forEachRemaining(c -> System.out.println(c));

    }
}
