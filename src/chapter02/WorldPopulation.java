package chapter02;

import java.util.Scanner;
public class WorldPopulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current year population: ");
        int currentYearPopulation = input.nextInt();

        System.out.print("Enter annual world population growth rate: ");
        int annualGrowthRate = input.nextInt();

        int yearOne = currentYearPopulation + (currentYearPopulation * annualGrowthRate);
        int yearTwo = yearOne + (yearOne * annualGrowthRate);
        int yearThree = yearTwo + (yearTwo * annualGrowthRate);
        int yearFour = yearThree + (yearThree * annualGrowthRate);
        int yearFive = yearFour + (yearFour * annualGrowthRate);

        System.out.printf("The Estimate World Population  for year one is %d%n", yearOne);
        System.out.printf("The Estimate World Population  for year two is %d%n", yearTwo);
        System.out.printf("The Estimate World Population  for year three is %d%n", yearThree);
        System.out.printf("The Estimate World Population  for year four is %d%n", yearFour);
        System.out.printf("The Estimate World Population  for year five is %d%n", yearFive);


    }
}
