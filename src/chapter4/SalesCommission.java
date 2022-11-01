package chapter4;
/* (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
sold for last week and calculates and displays that salesperson’s earnings.
 There’s no limit to the number of items that can be sold.
 */

import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int earning= 0;
        int counter = 0;
        System.out.println("Enter salesperson item or 0 to quit the calculation: ");
        double item = input.nextDouble();
        while (item != 0){
            earning +=item;
            counter+=1;

            System.out.println("Enter salesperson item or 0 to quit the calculation: ");
            item = input.nextDouble();
        }

        if (counter != 0){

            double commission = (double)(earning *0.09 + 200);
            System.out.printf("The Sales made the week is %d%nThe amount made for the week is $%d%n",counter, earning);
            System.out.printf("The commission for the week is $%.2f", commission);
        }
        else {
            System.out.println("No sale made for the week");
        }

    }
}
