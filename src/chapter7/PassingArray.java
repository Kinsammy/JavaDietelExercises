package chapter7;

public class PassingArray {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

        System.out.println("Effects of passing reference to entire array:%n" +
                "The values of the original array are:%n");

        for (int value : arrays) {
            System.out.printf("     %d", value);
        }

        PassArrayMethod.modifyArray(arrays);
        System.out.printf("%n%nThe values of the modified array are:%n");

        for (int value : arrays) {
            System.out.printf("     %d", value);
        }


        System.out.printf("%n%nEffects of passing array element value:%n" +
                "array[3] before modifyElement: %d%n", arrays[3]);

        PassArrayMethod.modifyElement(arrays[3]);
        System.out.printf(
                "array[3] after modifyElement: %d%n", arrays[3]);
    }
}
