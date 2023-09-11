package chapter5;

public class SumOfSeries {
    public static void main(String[] args) {
        long result = 0;
        int counter;
        System.out.printf("%4s%20s%n", "Number", "Sum");
        for (counter = 1; counter <= 100; counter++){
            result += counter;
            System.out.printf("%4d%20d%n",counter,result);
        }


    }
}
