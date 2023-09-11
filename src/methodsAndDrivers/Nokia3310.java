package methodsAndDrivers;

import java.util.Scanner;

import static methodsAndDrivers.Menu.*;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to see Menu: ");
        int menuList = input.nextInt();
        int back = 0;
        menu(back);
        System.out.println("Press 0 to go back to menu: ");
        back = input.nextInt();
        menu(back);
        Message.message();


    }
}
