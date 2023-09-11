package chapter4;
/*
(Credit Limit Calculator) Develop a Java application that determines whether any of several department-store customers has exceeded the credit limit on a charge account.
For each cus-tomer, the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded,
 the program should display the message "Credit limit exceeded".
 */

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
