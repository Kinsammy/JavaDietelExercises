package chapter7;

public class VariableLengthArgumentList {

    public static int average(int... numbers){
        int total = 0;
        for (int index : numbers){
            total += index;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        int firstNumber = 80;
        int secondNumber = 90;
        int thirdNumber = 40;
        int forthNumber = 30;
        int fifthNumber = 20;

        System.out.printf("The average of %d and %d is : %d", firstNumber, secondNumber, average(firstNumber,secondNumber));
    }
}
