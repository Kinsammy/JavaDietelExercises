package chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> ageList = new ArrayList<>();
        int limit = 10;
        int counter = 0;

        while (counter <= limit){
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            ageList.add(age);
            counter++;
        }
        for (int age : ageList){
            if (age <= 18){
                System.out.println(ageList.get(age));
            }
        }

    }
}
