package chapter4;
/*
(Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen,
then determine and display the citizen’s total tax. Use class Scanner to input the data.
 */

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
