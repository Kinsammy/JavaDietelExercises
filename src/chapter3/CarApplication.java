package chapter3;

public class CarApplication {
    public static void main(String[] args) {
        Car firstCar = new Car("Honda", "2021", 30_000.3);
        Car secondCar = new Car("Sienna", "2022", 50_300.5);

        System.out.printf("The first car details is NAME: %s%nYEAR: %s%nPRICE: $%.2f%n", firstCar.getModel(),firstCar.getYear(),firstCar.getPrice());
        System.out.printf("The second car details is NAME: %s%nYEAR: %s%nPRICE: $%.2f%n", secondCar.getModel(),secondCar.getYear(),secondCar.getPrice());

        System.out.printf("The first car Price with 5 percent Discount is $%.2f%n", firstCar.getDiscount1());
        System.out.printf("The second car Price with 7 percent Discount is $%.2f%n", secondCar.getDiscount2());
        firstCar.setPrice(70_000);
        System.out.printf("The first car Price with 5 percent Discount is $%.2f%n", firstCar.getPrice(),firstCar.getDiscount1());



    }
}
