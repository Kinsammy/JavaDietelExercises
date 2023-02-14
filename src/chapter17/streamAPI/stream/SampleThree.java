package chapter17.streamAPI.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SampleThree {
    public static void main(String[] args) {
        int[] numbers ={10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.stream(numbers)
                .mapToObj(SampleThree::buildPerson)
                .collect(Collectors.toList()));
    }

    private static Person buildPerson(int element) {
        Person person = new Person("Amirah", element, Gender.MALE);
        return person;
    }

//    Function<Integer,Person> function = (age) ->new Person();
}