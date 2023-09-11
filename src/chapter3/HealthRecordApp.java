package chapter3;

import java.util.Scanner;
public class HealthRecordApp {
    public static void main(String[] args) {
        HealthRecords person = new HealthRecords("David", "King","Male", 10, 5, 1990, 34.0, 50.0);

        System.out.printf("The initial record is%nFIRST NAME: %s%nLAST NAME: %s%nGENDER: %s%n",
                person.getFirstName(), person.getLastName(), person.getGender());
        System.out.printf("DATE OF BIRTH: %d.%d.%d%nHEIGHT: %f%nWEIGHT: %f%n",
                person.getMonth(),person.getDay(),person.getYear(), person.getHeight(), person.getWeight());
        System.out.printf("AGE: %d%n",person.getAge());
        System.out.printf("MAXIMUM HEART RATE: %d%n",person.maximumHeartRate());
        System.out.printf("TARGET HEART RATE: %f%n",person.targetHeartRate());
        System.out.printf("BMI: %d%n",person.maximumHeartRate());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        person.setFirstName(firstName);
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        person.setLastName(lastName);
        System.out.print("Enter gender: ");
        String gender = input.nextLine();
        person.setGender(gender);
        System.out.print("Enter birth month: ");
        int month = input.nextInt();
        person.setMonth(month);
        System.out.print("Enter birth day: ");
        int day = input.nextInt();
        person.setDay(day);
        System.out.print("Enter birth year: ");
        int year = input.nextInt();
        person.setYear(year);
        System.out.print("Enter height: ");
        int height = input.nextInt();
        person.setHeight(height);
        System.out.print("Enter weight: ");
        int weight = input.nextInt();
        person.setWeight(weight);

        System.out.printf("The new record is%nFIRST NAME: %s%nLAST NAME: %s%nGENDER: %s%n",
                person.getFirstName(), person.getLastName(), person.getGender());
        System.out.printf("DATE OF BIRTH: %d.%d.%d%nHEIGHT: %f%nWEIGHT: %f%n",
                person.getMonth(),person.getDay(),person.getYear(), person.getHeight(), person.getWeight());
        System.out.printf("AGE: %d%n",person.getAge());
        System.out.printf("MAXIMUM HEART RATE: %d%n",person.maximumHeartRate());
        System.out.printf("TARGET HEART RATE: %f%n",person.targetHeartRate());
        System.out.printf("BMI: %d%n",person.maximumHeartRate());


    }
}
