package kunaDataStructureAlgorithm;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to know if it is a prime number or not:: ");
        int number = scanner.nextInt();
        boolean ans = isPrime(number);
        System.out.println(ans);
    }

    private static boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }
        int count = 2;
        while (count * count <=number){
            if (number % count == 0){
                return false;
            }
            count++;
        }
        return count * count > number;
    }
}
