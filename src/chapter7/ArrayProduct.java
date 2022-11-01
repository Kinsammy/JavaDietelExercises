package chapter7;

public class ArrayProduct {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int product = 1;
        System.out.printf("%s%15s%n", "Index", "Value");
        for(int number = 1; number < numbers.length; number++){
            product *= numbers[number];
            System.out.printf("%d%15d%n", number, product);
        }

    }
}
