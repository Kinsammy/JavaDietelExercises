package applicationPackages;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<Long> phoneNumberList = new ArrayList<>();
        while (true){
            System.out.println("Enter user' name: ");
            String name = input.nextLine();
            nameList.add(name);
            System.out.println("Enter user's age: ");
            int age = console.nextInt();
            ageList.add(age);
            System.out.println("Enter user's Phone number: ");
            long phoneNumber = console.nextLong();
            phoneNumberList.add(phoneNumber);
            System.out.println("Is there any other use? Types 'yes' if any or 'no' if not: ");
            String option = input.nextLine().toLowerCase();
            if (!option.equals("yes")){

                System.out.printf("%10s%20s%20s%n", "Name", "Age", "Phone Number");
                System.out.println("-------------------------------------------------------------------");
                for (int index = 0; index < nameList.size(); index++) {
                    System.out.printf("%10s%20d%20d%n", nameList.get(index),
                            ageList.get(index), phoneNumberList.get(index));
                }
                System.out.println("=================================================================");
                break;
            }
        }
    }
}
