package kunaDataStructureAlgorithm;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ReverseNumber {
    public static void main(String[] args) {
        int numbers = 1534236469;
        int reverseInteger = reverseNum(numbers);

        System.out.println("The reversed Integer:: " + reverseInteger);



    }


    public static int reverse(int numbers) {
        int reverseNumber  = 0;

        boolean isNegative = false;
        if (numbers < 0){
            isNegative = true;
            numbers *= -1;
        }
        while (numbers > 0){
            int rem = numbers % 10;
            numbers /= 10;
            reverseNumber = reverseNumber * 10 + rem;
        }
        if (isNegative){
            reverseNumber*= -1;
        }

        return reverseNumber;
    }

    public static int reverseNum(int number){

        int firstRange =(int) Math.pow(2, 31-1);
        int secondRange =(int) Math.pow(-2, 31);
        if( number > firstRange || number < secondRange){
            return 0;
        }
        return -1;
    }

}
