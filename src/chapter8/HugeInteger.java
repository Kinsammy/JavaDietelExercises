package chapter8;

public class HugeInteger {
    private int[] digitArray = new int[40];
    private int digitLength;


//    public HugeInteger(String value) {
//        parse(value);
//    }

    public void parse(String value) {
        digitLength = value.length();
        for (int index = 0; index < value.length(); index++){
            String character = Character.toString(value.charAt(index));
            digitArray[index] = Integer.parseInt(character);
        }
    }


    public int[] getDigitArray() {
        return digitArray;
    }

    public boolean isEqualTo(int firstNumber, int secondNumber) {
        boolean condition = false;
        if (firstNumber == secondNumber){
            condition = true;
        }
        return condition;
    }

    public boolean isNotEqualTo(int firstNumber, int secondNumber) {
        boolean condition = false;
        if (firstNumber != secondNumber){
            condition = true;
        }
        return condition;
    }

    public boolean isGreaterThan(int firstNumber, int secondNumber) {
        boolean condition = false;
        if (firstNumber > secondNumber){
            condition = true;
        }
        return condition;
    }

    public boolean isLessThan(int firstNumber, int secondNumber) {
        boolean condition = false;
        if (firstNumber < secondNumber){
            condition = true;
        }
        return condition;
    }

    public boolean isGreaterThanOrEqualTo(int firstNumber, int secondNumber) {
        boolean condition = false;
        if (firstNumber >= secondNumber){
            condition = true;
        }
        return condition;
    }

    public boolean isLessThanOrEqualTo(int firstNumber, int secondNumber) {
        boolean condition = false;
        if (firstNumber <= secondNumber){
            condition = true;
        }
        return condition;
    }

//    public String add(String number) {
//        for (int index = 0; index < number.length(); index++){
//        }
//    }
}
