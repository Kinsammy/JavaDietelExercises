package chapter4;

import  java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int totalMile = 0;
        int totalGallons = 0;
        int counter = 0;

        System.out.println("Enter miles driven or press -1 to quit: ");
        int mile = input.nextInt();
        System.out.println("Enter gallons used or press -1 to quit: ");
        int gallons = input.nextInt();

        while (mile  != -1 && gallons != -1){
            totalMile += mile;
            totalGallons += gallons;
            counter++;

            System.out.println("Enter miles driven or press -1 to quit: ");
            mile = input.nextInt();
            System.out.println("Enter gallons used or press -1 to quit: ");
            gallons = input.nextInt();
        }
        double average = totalMile/ totalGallons;
        if (counter != 0){
            double milePerGallon1 = totalMile/counter;
            double milePerGallon2 = totalGallons/counter;

            System.out.printf("Total mile per liter is %d%n", totalMile);
            System.out.printf("Total gallons  is %d%n", totalGallons);
            System.out.printf("The total trip is %d%n", counter);
            System.out.printf("mile is%.2f%n", milePerGallon1);
            System.out.printf("Gallons is %.2f%n", milePerGallon2);
            System.out.printf("Average is %.2f%n", average);
        }
        else {
            System.out.print("No Trip!");
        }


    }
}
