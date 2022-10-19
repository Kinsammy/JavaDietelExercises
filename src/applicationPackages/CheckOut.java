package applicationPackages;

import java.util.Objects;
import java.util.Scanner;

import static applicationPackages.CheckOutMethod.totalPrice;

public class CheckOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        String item;

        System.out.println("Welcome! Any new item? Enter yes/no");
        String option = input.nextLine();
        System.out.println("What did the user buy? ");
        item = input.nextLine();
        System.out.println("How many pieces? ");
        double quantity = console.nextDouble();
        System.out.println("How much per unit? ");
        double unit = console.nextDouble();
        while (!Objects.equals(option, "no")) {
            System.out.println("Any other item? ");
            String reply = input.nextLine();
            if (!Objects.equals(reply, "no")) {
                System.out.println("What did the user buy? ");
                item = input.nextLine();
                System.out.println("How many pieces? ");
                quantity = console.nextDouble();
                System.out.println("How much per unit? ");
                unit = console.nextDouble();

            } else {
                break;
            }
        }
        System.out.printf("%4s%24.2f%24.2f%24.2f%n", item, quantity, unit, totalPrice(quantity, unit));

    }
}