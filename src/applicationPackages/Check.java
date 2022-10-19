package applicationPackages;

import java.util.ArrayList;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        ArrayList<Double> unitPriceList = new ArrayList<>();
        System.out.println("Welcome to Semicolon Mall");
        while (true) {
            System.out.println("What did the user buy? ");
            String item = input.nextLine();
            itemList.add(item);
            System.out.println("How many pieces? ");
            int quantity = console.nextInt();
            quantityList.add(quantity);
            System.out.println("How much per unit? ");
            double unitPrice = console.nextDouble();
            unitPriceList.add(unitPrice);
            System.out.println("Do you want to continue? ");
            String option = input.nextLine().toLowerCase();
            if (!option.equals("yes")){
                CheckOutMethod.display(itemList, quantityList, unitPriceList);
                break;
            }
        }
    }
}
