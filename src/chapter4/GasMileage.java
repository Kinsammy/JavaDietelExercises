package chapter4;

import  java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double totalMile = 0;
        double totalGallons = 0;
        int counter = 0;

        System.out.println("Enter miles driven or press -1 to quit: ");
        double mile = input.nextInt();
        System.out.println("Enter gallons used or press -1 to quit: ");
        double gallons = input.nextInt();

        while (mile  != -1 && gallons != -1){
           double milePerGallon = mile / gallons;
            totalMile += mile;
            totalGallons += gallons;
            System.out.printf("The mile per gallon is : %.2f%n", milePerGallon);
            counter++;

            System.out.println("Enter miles driven or press -1 to quit: ");
            mile = input.nextInt();
            System.out.println("Enter gallons used or press -1 to quit: ");
            gallons = input.nextInt();
        }
        if (counter != 0){
            double average = totalMile/ totalGallons;

            System.out.printf("Total mile per liter is %.2f%n", totalMile);
            System.out.printf("Total gallons  is %.2f%n", totalGallons);
            System.out.printf("The total trip is %d%n", counter);
            System.out.printf("Average is %.2f%n", average);
        }
        else {
            System.out.print("No Trip!");
        }
    }
}
