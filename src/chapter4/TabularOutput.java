package chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        int number = 1;
        System.out.printf("N\t\tN^2\t\tN^3\t\tN^4");

        while (number <= 5){
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n",
                    (number), (number * number), (number * number * number),
                    (number * number * number * number));
            number++;
        }

    }
}
