package chapter7;

public class PassingValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Effects of passing reference to entire array:%n" +
                "The values of the original array are:%n");

        for (int value : array) {
            System.out.printf("     %d", value);
        }
    }
}
