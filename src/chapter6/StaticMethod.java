package chapter6;

import java.util.Scanner;

public class StaticMethod {
    static Scanner input = new Scanner(System.in);
    public static int addNumber(int number1, int number2){
        return number1 + number2;
    }

    public static String data(String name, int age){
        return name + " " + age;
    }

    public static int largest(int num1, int num2, int num3){
        int largest = num1;
        if(num2 > largest) {
            largest = num2;
            System.out.println("Second number is the largest");
        }
        else if (num3 > largest){
            System.out.println("Third number is the largest");
            largest = num3;
        }
        else {
            System.out.println("First number is the largest");
        }
        return largest;
    }

    public static String setName(String name){
        System.out.println("Enter name: ");
        name = input.nextLine();
        return "Welcome " + name;
    }
}
