package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        int[] firstClass = new int[5];
        int[] economy = new int[5];
        for (int index = 1; index <= seats.length; index++) {
            try {
                System.out.println("Please type 1 for First Class or Please type 2 for Economy: ");
                int alternatives = input.nextInt();
                if (alternatives == 1) {
                    firstClass[index] += alternatives;
                }
                else {
                    economy[index] += alternatives;
                }
            }
            catch (IndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Index is out on bound");
            }

        }
        System.out.println(Arrays.toString(firstClass));
        System.out.println(Arrays.toString(economy));
    }
}
