package classWork;

public class SumArrayMethod {

    public int addNumber(int[] numbers){
        int total = 0;
        for (int number : numbers){
            total += number;
        }
        return total;
    }
}
