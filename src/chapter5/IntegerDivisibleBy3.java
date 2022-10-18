package chapter5;

public class IntegerDivisibleBy3 {
    public static void main(String[] args) {

        int sum = 0;
        for (int counter = 1; counter <= 30; counter++){
            if (counter % 3 == 0){
                System.out.println(counter);
            }
            sum += counter;
        }
        System.out.printf("The sum of the Numbers divisible by 3 is: %d", sum);
    }
}
