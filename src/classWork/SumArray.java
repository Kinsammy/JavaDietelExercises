package classWork;

public class SumArray {
    public static void main(String[] args) {
        SumArrayMethod addition = new SumArrayMethod();
        int[] numbers = {54, 34, 10, 39};
        System.out.printf("The Sum of the Numbers is: %d",  addition.addNumber(numbers));
        // System.out.printf("The Sum of the Numbers is: %d",  addition.addNumber(new int[]{54, 34, 10, 39}));
    }
}
