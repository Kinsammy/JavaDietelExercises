package chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        int number = 1;
        System.out.printf("%s%10s%10s%10s%n","N","N^2","N^3","N^4");

        while (number <= 5){
            System.out.printf("%d%10d%10d%10d%n",
                    (number), (number * number), (number * number * number),
                    (number * number * number * number));
            number++;
        }

    }
}
