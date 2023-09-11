package methodsAndDrivers;

import java.util.Scanner;
public class Menu {

    static Scanner input = new Scanner(System.in);

    private static int mainMenu;
    private static int message;

    public static int menu(int back) {
        System.out.println("1. Phone book");
        System.out.println("2. Message");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminder");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");
        System.out.println("Choose 1 - 13 to pick a menu: ");
        int mainMenu = input.nextInt();
        switch (mainMenu) {
            case 1 -> System.out.println("1. Phone book");
            case 2 -> System.out.println("2. Message");
            case 3 -> System.out.println("3. Chat");
            case 4 -> System.out.println("4. Call register");
            case 5 -> System.out.println("5. Tones");
            case 6 -> System.out.println("6. Settings");
            case 7 -> System.out.println("7. Call divert");
            case 8 -> System.out.println("8. Games");
            case 9 -> System.out.println("9. Calculator");
            case 10 -> System.out.println("10. Reminders");
            case 11 -> System.out.println("11. Clock");
            case 12 -> System.out.println("12. Profile");
            case 13 -> System.out.println("13. SIM services");
        }
        return mainMenu;
    }

//    public static void phoneBook() {
//    }

    public static int message(){
        if(mainMenu == 2) {
            message();

        }
        return message;
    }

//    public static void chat() {
//        mainMenu = 3;
//        System.out.println("Chat");
//    }

}