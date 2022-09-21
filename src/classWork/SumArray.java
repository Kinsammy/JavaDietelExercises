package classWork;

public class SumArray {
    public static void main(String[] args) {

        int[] numbers = {23, 67, 23, 17, 13, 20};
        int total = 0;

        for (int counter = 0; counter < numbers.length; counter++){
            total += numbers[counter];
            System.out.println(numbers[counter]);
        }
        System.out.println();
        System.out.printf("The Sum of the Numbers is: %d", total);
    }
}
