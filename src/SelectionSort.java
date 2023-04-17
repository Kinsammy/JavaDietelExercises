import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 6, 5, 1, 3};
        selectionSort(numbers);
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++){
            int midIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] > array[midIndex]){
                    midIndex = j;
                }
            }
            if (i != midIndex){
                int temp = array[i];
                array[i] = array[midIndex];
                array[midIndex] = temp;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
