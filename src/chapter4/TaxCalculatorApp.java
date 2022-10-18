package chapter4;

import java.util.Scanner;

public class TaxCalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        double totalTax = 0;
        double taxRate;
        int counter = 1;
        while (counter <= 3) {
            System.out.print("Enter Citizen's name: ");
            String name = input.nextLine();
            System.out.print("Enter Citizen's earning: ");
            int earning = console.nextInt();
            if (earning <= 30_000){
                taxRate = earning * 0.15;
                System.out.printf("%s, Your tax is %.2f%n" , name, taxRate);
            }
            else {
                taxRate = earning * 0.20;
                System.out.printf("%s, Your tax is %.2f%n" , name, taxRate);
            }
            totalTax += taxRate;
            counter ++;
        }
        System.out.printf("The three Citizen  total tax_rate is %.2f", totalTax);
    }
}
