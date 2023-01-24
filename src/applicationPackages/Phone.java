package applicationPackages;

import java.util.Scanner;

public class Phone {

    private static final Scanner input = new Scanner(System.in);

    public static void display(){
        System.out.println("""
                                ________________________________________________________________________
                                |                                                                       |  \s
                                |                             YOU ARE WELCOME                           |
                                |                                                                       |
                                |                                  NOKIA                                |
                                |                                                                       | \s
                                |_______________________________________________________________________|
                """);

        phoneMenu();

    }

    private static void phoneMenu() {
        System.out.println("Press 1 to see Menu: ");
        System.out.println("""
                           1.   Phone book
                           2.   Message
                           3.   Chat
                           4.   Call register
                           5.   Tones
                           6.   Settings
                           7.   Call divert
                           8.   Games
                           9.   Calculator
                           10.  Remainder
                           11.  Clock
                           12.  Profile
                           13.  Sim services
                           0.   Switch Off
                           """);

        System.out.println("Press 1 - 13 to pick a menu or press 0 to switch-off the phone: ");
        int menu = input.nextInt();
        switch (menu) {
            case 1 -> {
                        System.out.println("1. Phone book");
                        phoneBook();
            }
            case 2 -> {
                        System.out.println("2. Message");
                        message();
            }
            case 3 -> {
                        System.out.println("3. Chat");
                        System.out.println("Press 0 to go back to previous menu: ");
                        int opt = input.nextInt();
                        if (opt == 0){
                            phoneMenu();
                        }
            }
            case 4 -> {
                        System.out.println("4. Call register");
                        callRegister();
            }
            case 5 ->{
                       System.out.println("5. Tones");

                    }
            case 6 ->{
                        System.out.println("6. Settings");

                     }
            case 7 ->{
                        System.out.println("7. Call divert");

                     }
            case 8 ->{
                        System.out.println("8. Games");

                     }
            case 9 ->{
                        System.out.println("9. Calculator");

                   }
            case 10 ->{
                        System.out.println("10. Reminders");

                    }
            case 11 ->{
                        System.out.println("11. Clock");
                        phoneMenu();
                    }
            case 12 ->{
                        System.out.println("12. Profile");
                        phoneMenu();
                    }
            case 13 ->{
                        System.out.println("13. SIM services");
                        phoneMenu();
                      }
            default -> switchOff();

        }
    }

    private static void callRegister() {
        System.out.println("Press 1 to see Call register option or 0 to go back to the previous menu: ");
        System.out.println("""
                1.  Missed calls
                2.  Received calls
                3.  Dialled numbers
                4.  Erase recent call lists
                5.  Show call duration
                6.  Show call costs
                7.  Call cost settings
                8.  Prepaid credit
                0.  Back \s
                """);
        System.out.println("Choose from 1-8 to pick call register or press 0 to go back to the previous menu");
        int callOptions = input.nextInt();
        switch (callOptions) {
            case 1 -> {
                System.out.println("1. Missed calls");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callRegister();
                }
            }
            case 2 -> {
                System.out.println("2. Received calls");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callRegister();
                }
            }
            case 3 -> {
                System.out.println("3. Dialled numbers");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callRegister();
                }
            }
            case 4 -> {
                System.out.println("4. Erase recent call lists");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callRegister();
                }
            }
            case 5 -> {
                System.out.println("5. Show call duration");
                callDuration();
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callRegister();
                }
            }
            case 6 -> {
                System.out.println("6. Show call costs");
                callCost();
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callRegister();
                }

            }
            case 7 -> {
                System.out.println("7. Call cost settings");
                costSettings();

            }
            case 8 -> {
                System.out.println("8. Prepaid credit");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callRegister();
                }
            }
            default -> phoneMenu();
        }

    }

    private static void costSettings() {
        System.out.println("Press 1 to see the Call cost settings or 0 to go back to the previous menu: ");
        System.out.println("""
                                1.  Call cost limit
                                2.  Show costs in
                                0.  Back
                           """);
        System.out.println("Select either 1 or 2 to pick Call cost settings or 0 to go back to the previous menu: ");
        int callCostSettings = input.nextInt();
        switch (callCostSettings) {
            case 1 -> {
                System.out.println("1. Call cost limit");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    costSettings();
                }
            }
            case 2 -> {
                System.out.println("2. Show costs in");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    costSettings();
                }
            }
            default -> callRegister();
        }

    }

    private static void callCost() {
        System.out.println("Press 1 to Show call costs or 0 to go back to the previous menu: ");
        System.out.println("""
                        1.  Last call cost
                        2.  All calls' cost
                        3.  Clear timer
                        0.  Back
                        """);

        System.out.println("Choose from 1-3 to show a  call cost or 0 to go back to the previous menu");
        int showCallCost = input.nextInt();
        switch (showCallCost) {
            case 1 -> {
                System.out.println("1. Last call cost");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callCost();
                }
            }
            case 2 ->{
                System.out.println("2. All calls' cost");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callCost();
                }
            }
            case 3 -> {
                System.out.println("3. Clear timer");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callCost();
                }
            }
            default -> callRegister();
        }

    }

    private static void callDuration() {
        System.out.println("Press 1 to show call duration or 0 to go back to the previous menu: ");
        System.out.println("""
                        1.  Last call duration
                        2.  All calls' duration
                        3.  Received calls' duration
                        4.  Dialled calls' duration
                        5.  Clear timers
                        0.  Back
                        """);

        System.out.println("Choose from 1-5 to show a call duration: ");
        int showCallDuration = input.nextInt();
        switch (showCallDuration) {
            case 1 -> {
                System.out.println("1. Last call duration");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callDuration();
                }
            }
            case 2 -> {
                System.out.println("2. All calls' duration");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callDuration();
                }
            }
            case 3 -> {
                System.out.println("3. Received calls' duration");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callDuration();
                }
            }
            case 4 -> {
                System.out.println("4. Dialled calls' duration");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callDuration();
                }

            }
            case 5 -> {
                System.out.println("5. Clear timers");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    callDuration();
                }
            }
            default -> callRegister();
        }

    }

    private static void message() {
        System.out.println("Press 1 to see Messages menu or 0 to go back to the previous menu:");
        System.out.println("""
                1.  Write messages
                2.  Inbox
                3.  Outbox
                4.  Picture messages
                5.  Templates
                6.  Smileys
                7.  Message settings
                8.  Info service
                9.  Voice mailbox number
                10. Service command editor
                0.  Back
                """);

        System.out.println("Choose from 1- 10 to pick a Messages menu or press 0 to go back or press 00 to switch off: ");
        int messagesOption = input.nextInt();
        switch (messagesOption) {
            case 1 -> {
                System.out.println("1. Write messages");
                message();
            }
            case 2 -> {
                System.out.println("2. Inbox");
                message();
            }
            case 3 -> {
                System.out.println("3. Outbox");
                message();
            }
            case 4 -> {
                System.out.println("4. Picture messages");
                message();
            }
            case 5 -> {
                System.out.println("5. Templates");
                message();
            }
            case 6 -> {
                System.out.println("6. Smileys");
                message();
            }
            case 7 -> {
                System.out.println("7. Message settings");
                messageSetting();
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    message();
                }

            }
            case 8 -> {
                System.out.println("8. Info service");
                message();
            }
            case 9 -> {
                System.out.println("9. Voice mailbox number");
                message();
            }
            case 10 -> {
                System.out.println("10. Service command editor");
                message();
            }
            default -> phoneMenu();
        }

    }

    private static void messageSetting() {
        System.out.println("Press 1 to see Message settings menu or 0 to go back to the previous menu");
        System.out.println("""
                        1. Set
                        2. Common
                        0. Back
                        """);
        System.out.println("Select 1 or 2 to pick a list or 0 to go back to the previous menu");
        int messageSettings = input.nextInt();
        switch (messageSettings) {
            case 1 -> {
                System.out.println("1. Set");
                messageSet();
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    messageSetting();
                }
            }
            case 2 -> {
                System.out.println("2. Common");
                commonSetting();
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    messageSetting();
                }
            }
            default -> message();
        }

    }

    private static void commonSetting() {
        System.out.println("Press 1 to see Common lists or 0 to go back to the previous menu: ");
        System.out.println("""
                                1.  Delivery reports
                                2.  Reply via same centre
                                3.  Character support
                                0.  Back
                                """);
        System.out.println("Choose from 1-3 to pick a Common list or 0 to go back to the previous menu: ");
        int common = input.nextInt();
        switch (common) {
            case 1 -> {
                System.out.println("1. Delivery reports");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    commonSetting();
                }
            }
            case 2 -> {
                System.out.println("2. Reply via same centre");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    commonSetting();
                }
            }
            case 3 -> {
                System.out.println("3. Character support");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    commonSetting();
                }
            }
            default -> messageSetting();
        }
    }

    private static void messageSet() {
        System.out.println("Press 1 to see Set lists: ");
        System.out.println("""
                                1.  Message centre number
                                2.  Message sent as
                                3.  Message validity
                                0.  Back
                                """);
        System.out.println("Choose from 1-3 to pick a set list or 0 to go back to previous menu");
        int sets = input.nextInt();
        switch (sets) {
            case 1 -> {
                System.out.println("1. Message centre number");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    messageSet();
                }
            }
            case 2 -> {
                System.out.println("2. Message sent as");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    messageSet();
                }
            }
            case 3 -> {
                System.out.println("3. Message validity");
                System.out.println("Press 0 to go back to previous menu: ");
                int opt = input.nextInt();
                if (opt == 0){
                    messageSet();
                };
            }
            default -> messageSetting();
        }

    }

    private static void switchOff() {
        while (true){
            System.out.println("""
                Do you want to switch off the phone ?
                
                Enter Yes or No\s
                """);
            String option = input.next().toLowerCase();
            if (!option.equals("no")){
                System.out.println("Good bye!");
                break;
            } else {
                phoneMenu();
            }
        }
    }

    private static void phoneBook() {
        System.out.println("Choose from 1- 10 to see Phone book menu or 0 press 0 to go back to previous menu");
        System.out.println("""
                           1.   Search
                           2.   Service Nos.
                           3.   Add name
                           4.   Erase
                           5.   Edit
                           6.   Assign tone
                           7.   Send b' card
                           8.   Options
                           9.   Speed dials
                           10.  Voice tags
                           0.   Back
                           """);

        System.out.println("Choose from 1-10 to pick a menu or 0 to go back to previous menu: ");
                int phoneBook = input.nextInt();
                switch (phoneBook) {
                    case 1 -> System.out.println("1. Search");
                    case 2 -> System.out.println("2. Service Nos.");
                    case 3 -> System.out.println("3. Add name");
                    case 4 -> System.out.println("4. Erase");
                    case 5 -> System.out.println("5. Edit");
                    case 6 -> System.out.println("6. Assign tone");
                    case 7 -> System.out.println("7. Send b' card");
                    case 8 -> {
                        System.out.println("8. Options");
                            options();
                        System.out.println("Press 0 to go back to previous menu: ");
                        int opt = input.nextInt();
                        if (opt == 0){
                            phoneBook();
                        }
                    }
                    case 9 -> System.out.println("9. Speed dials");
                    case 10 -> System.out.println("10. Voice tags");
                    default -> phoneMenu();
                }
            }

    private static void options() {
        System.out.println("Press 1 to see Options or 0 to go back previous menu: ");


        System.out.println("""
                            1. Type of view
                            2. Memory status
                            0. Back
                            """);
        System.out.println("Select either 1 or 2 or 0 to go back to previous menu: ");
        int options = input.nextInt();
        switch (options) {
            case 1 -> {
                        System.out.println("1. Type of view");
                        System.out.println("Press 0 to go back to previous menu: ");
                        int opt = input.nextInt();
                        if (opt == 0){
                            options();
                        }

                    }
            case 2 -> {
                         System.out.println("2. Memory status");
                        System.out.println("Press 0 to go back to previous menu: ");
                        int opt = input.nextInt();
                        if (opt == 0){
                            options();
                        }
            }
            default -> phoneBook();
        }
    }
}
