import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {12, 16, 32, 14};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(secondReverse(numbers)));
    }

    private static void bubbleSort(int[] numbers) {
        for (int i = 0; i< numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] secondReverse(int[] numbers){
        for (int row = 0; row < numbers.length; row++){
            for (int column = 0; column < numbers.length; column++){
                if (numbers[row] > numbers[column]){
                    int temp = numbers[row];
                    numbers[row] = numbers[column];
                    numbers[column] = temp;
                }
            }
        }
        return numbers;
    }
}
