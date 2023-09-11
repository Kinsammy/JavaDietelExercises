package chapter3;

import java.util.Scanner;
public class FirstAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FirstAccount myAccount = new FirstAccount();

        System.out.printf("The initial name in the account is: %s%n",
                myAccount.getName());
        System.out.print("Enter account name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.printf("The name in the account is %s ",
                myAccount.getName());

    }
}
