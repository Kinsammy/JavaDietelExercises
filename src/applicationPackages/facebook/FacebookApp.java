package applicationPackages.facebook;

import java.util.Scanner;

public class FacebookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Database database = new Database();

        System.out.println("Enter your user name: ");
        String username = input.nextLine();
        database.setUsername(username);

        System.out.println("Enter your password: ");
        String password = input.nextLine();
        database.setPassword(password);

        database.login(database.getUsername(), database.getPassword());




    }
}
