package testingClasses;
public class ArrayOperation {
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int maximum(int[] numbers) {
        int maximumValue = numbers[0];
        for (int number = 0; number <= numbers.length; number++){
            if(number > maximumValue){
                maximumValue = number;
            }
        }
        return maximumValue;
    }
    public static int minimum(int[] numbers) {
        int minimumValue = numbers[0];
        for (int number : numbers) {
            if (number < minimumValue) {
                minimumValue = number;
            }

        }
        return minimumValue;
    }

    public static int arrayMin(int[] arrays) {
        return sum(arrays) - maximum(arrays);
    }

    public static int arrayMax(int[] arrays) {
        return sum(arrays) - minimum(arrays);
    }
}
