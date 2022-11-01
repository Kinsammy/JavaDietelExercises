package chapter7;

public class ArrayEl {

    public static double average(double... numbers){
        double total = 0.0;

        for (double index : numbers){
            total += index;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        double firstNumber = 20.90;
        double secondNumber = 90.90;
        double thirdNumber = 30.90;
        double forthNumber = 40.00;

        System.out.printf("Average of first number and last number is %.1f%n",
                average(firstNumber, forthNumber));
        System.out.printf("Average of all the numbers is %.1f%n",
                average(firstNumber,secondNumber, thirdNumber, forthNumber));


    }

}
