package chapter7;

public class Exercise7_8b {
    public static void main(String[] args) {
        int[] numbers = {-1, -1, -1, -1, -1, -1};

        System.out.printf("%9s%15s%n", "Counter", "Numbers");
        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.printf("%9d%15d%n",counter, numbers[counter]);
        }
    }
}
