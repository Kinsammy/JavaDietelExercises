package chapter4;

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
