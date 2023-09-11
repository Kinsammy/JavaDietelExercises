package chapter7;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] elements = new int[5];
        int counter = 0;
        while (counter < 5) {
            System.out.print("Enter number between 0 and 100: ");
            int number = input.nextInt();
            if (number >= 0 && number <= 100) {
                elements[counter] = number;
                counter++;
            }
        }
        int[] max = maxiAndMin(elements);
        System.out.printf("%nThe maximum is %d and%nThe minimum is %d", max[0], max[1]);
    }
    public static int[] maxiAndMin(int[] elements) {
        int max = elements[0];
        int min = elements[0];
        int[] result = new int[2];
        for (int array : elements) {
            if (array > max) {
                max = array;
            }
            result[0] = max;
            if (array < min) {
                min = array;
            }
            result[1] = min;
        }
        return result;

    }
}