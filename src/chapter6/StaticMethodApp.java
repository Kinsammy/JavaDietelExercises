package chapter6;

public class StaticMethodApp {
    public static void main(String[] args) {
        System.out.println(StaticMethod.addNumber(7,3));
        System.out.println(StaticMethod.addNumber(17,13));
        System.out.println(StaticMethod.data("Samuel", 30));
        System.out.println(StaticMethod.largest(120,100,30));
        System.out.println(Math.abs(900.754));
        System.out.println(StaticMethod.setName("Sam"));

    }
}
