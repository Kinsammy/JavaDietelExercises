package chapter4;

import java.util.Scanner;
public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter balance at the beginning of the month: ");
        int balance = input.nextInt();
        System.out.println("Enter total of all the items charged by the customer this: ");
        int charges = input.nextInt();
        System.out.println("Enter total of all credits applied to the customer's account this: ");
        int credits = input.nextInt();
        System.out.println("Enter allowed credits limit: ");
        int limit = input.nextInt();

        int newBalance = balance +  charges - credits;
        System.out.printf("The new balance is %d%n", newBalance);
        if (newBalance > limit){
            System.out.println("Credit limit did not exceed the limit");

        }
        else {
            System.out.println("Credit limit exceeded");
        }
    }
}
