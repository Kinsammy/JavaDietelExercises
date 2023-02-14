package chapter17.streamAPI.stream;

import java.util.PriorityQueue;
import java.util.Queue;
public class PersonApp {



        public static void main(String[] args) {
            Person person = new Person("Amirah", 45, Gender.MALE);
            Person person1 = new Person("Chibuzo", 80, Gender.MALE);
            Person person2 = new Person("Balablu", 180, Gender.MALE);
            Person person3 = new Person("Buhari", 130, Gender.MALE);
            Person person4 = new Person("Shettima", 75, Gender.MALE);
            Person person5 = new Person("Keyamo", 60, Gender.MALE);

            Queue<Person> votersRegistration = new PriorityQueue<>((a, b)->b.getAge()-a.getAge());
            votersRegistration.offer(person);
            votersRegistration.offer(person1);
            votersRegistration.offer(person2);
            votersRegistration.offer(person3);
            votersRegistration.offer(person5);

            System.out.println(votersRegistration.poll());
            System.out.println(votersRegistration.poll());
            System.out.println(votersRegistration.poll());
            System.out.println(votersRegistration.poll());
            System.out.println(votersRegistration.poll());

            System.out.println(votersRegistration);
        }
}
