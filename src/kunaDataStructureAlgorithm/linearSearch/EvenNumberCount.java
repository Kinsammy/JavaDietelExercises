package kunaDataStructureAlgorithm.linearSearch;

public class EvenNumberCount {
    public static void main(String[] args) {
        int[] numbers = {12, 345, 2, 6, -7896};
        int even = findEvenNumbers(numbers);
        System.out.println(even);
    }

    public static int findEvenNumbers(int[] numbers){
        int count = 0;

        for (int index = 0; index < numbers.length; index++) {
            int even = countNumberOfDigits(numbers[index]);
            if (even % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int countNumberOfDigits(int number){
        int count = 0;

//        while (number > 0){
//            count++;
//            number /=10;
//        }
        if (number < 0){
            number *= -1;
        }
        //        return count;
        // todo shortcut on how count digit
        return (int)(Math.log10(number)) -1;

    }

}
