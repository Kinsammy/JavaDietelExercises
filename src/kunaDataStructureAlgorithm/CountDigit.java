package kunaDataStructureAlgorithm;

import java.util.Arrays;

public class CountDigit {
    public static void main(String[] args) {
        int number = 24324562;
        int count = 0;
        while (number > 0){
            if (number % 10 == 2){
                count++;
            }
          number= number /10;
        };

        System.out.printf("the numbers of 2's are:: %d", count);


    }
}
