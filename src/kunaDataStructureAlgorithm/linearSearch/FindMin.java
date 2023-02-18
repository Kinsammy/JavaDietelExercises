package kunaDataStructureAlgorithm.linearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] numbers = {18, 12, -7, 3, 14, 28};
        int minNumber = minElement(numbers);
        int maxNumber = maxElement(numbers);
        System.out.println("The minimum number:: "+minNumber);
        System.out.println("The maximum number:: "+maxNumber);
    }

    public static int minElement(int[] numbers) {
        if (numbers.length == 0){
            return 0;
        }
        int minValue = numbers[0];

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] <minValue){
                minValue = numbers[index];
            }
        }

        return minValue;
    }

    public static int maxElement(int[] numbers) {
        if (numbers.length == 0){
            return 0;
        }
        int maxValue = numbers[0];

        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        return maxValue;
    }
}
