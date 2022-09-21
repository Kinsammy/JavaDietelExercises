package chapter6;

import java.util.Scanner;
public class PhoneMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Press 1 for Phone Menu ");
        int menu = input.nextInt();

        int phoneBook;
        int message;
        int chat;
        int callRegister;
        int showCallDuration;
        int showCallCosts;
        int callCostSettings;
        int prepaidCredit;
        int tones;
        int settings;
        int callDivert;
        int games;
        int calculator;
        int reminders;
        int clock;
        int profiles;
        int simServices;

        System.out.println("MENU" +
                "1. Phone Book" +
                "2. Messages" +
                "3. Chat" +
                "4. Call Register" +
                "5. Tones" +
                "6. Settings" +
                "7. Call divert" +
                "8. Games" +
                "9. Calculator" +
                "10. Reminders" +
                "11. Clock" +
                "12. Profiles" +
                "13. Sim services");

        switch (menu) {
            case 1:
                if (menu == 1) {
                    System.out.println("Phone Book" +
                            "1. Search" +
                            "2. Service Nos." +
                            "3. Add name" +
                            "4. Erase" +
                            "5. Edit" +
                            "6. Assign tone" +
                            "7. Send b'card" +
                            "8. Options" +
                            "9. Speed dials" +
                            "10. Voice tags");
                }
        }

        System.out.println("Enter 1 to open Phone Book");
        phoneBook = input.nextInt();

        if (phoneBook > 1 && phoneBook < 10) {
            switch (phoneBook) {
                case 1 -> System.out.println("Search");
                case 2 -> System.out.println("Service Nos.");
                case 3 -> System.out.println("Add name");
                case 4 -> System.out.println("Erase");
                case 5 -> System.out.println("Edit");
                case 6 -> System.out.println("Assign tone");
                case 7 -> System.out.println("Send b'card");
                case 8 -> {
                    System.out.println("Options" +
                            "1. Type of view" +
                            "2. Memory status");
                    int options = input.nextInt();

                    if (options > 1 && options < 2) {
                        switch (options) {
                            case 1:
                                System.out.println("Type of View");
                                break;

                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }
                    }
                }

                case 9 -> System.out.println("Speed dials");
                case 10 -> System.out.println("Voice tags");

            }

            if (menu > 1 && menu < 13) {
                switch (menu) {
                    case 2:
                        if (menu == 2) {
                            System.out.println("Message" +
                                    "1. Write messages" +
                                    "2. Inbox" +
                                    "3. Outbox" +
                                    "4. Picture messages" +
                                    "5. Templates" +
                                    "6. Simileys" +
                                    "7. Message settings" +
                                    "8. Info service" +
                                    "9. Voice mailbox number" +
                                    "10. Service command editor");
                        }
                }

            }
        }
        System.out.print("Enter 1 to open message: ");
        message = input.nextInt();

        if (message > 1 && message < 10) {
            switch (message) {
                case 1 -> System.out.println("Write a Message");
                case 2 -> System.out.println("Inbox");
                case 3 -> System.out.println("Outbox");
                case 4 -> System.out.println("Picture message");
                case 5 -> System.out.println("Templates");
                case 6 -> System.out.println("Similey");
                case 7 -> {
                    System.out.println("Message settings" +
                            "1. Set" +
                            "2. Common");
                    int messageSetting = input.nextInt();
                    if (messageSetting > 1 && messageSetting < 3) {
                        switch (messageSetting) {
                            case 1 -> {
                                System.out.println("Set" +
                                        "1. Message center number" +
                                        "2. Messages sent as" +
                                        "3. Message validity");

                                int set = input.nextInt();
                                if (set > 1 && set < 3) {
                                    switch (set) {
                                        case 1:
                                            System.out.println("Message center number");
                                        case 2:
                                            System.out.println("Message sent as");
                                        case 3:
                                            System.out.println("Message validity");
                                    }
                                }
                            }
                        }
                        if (messageSetting == 2) {
                            System.out.println("Common" +
                                    "1. Delivery reports" +
                                    "2. Reply via same center" +
                                    "3. Character support");
                            int common = input.nextInt();
                            if (common > 1 && common < 3) {
                                switch (common) {
                                    case 1 -> System.out.println("Delivery report");
                                    case 2 -> System.out.println("Reply via same center");
                                    case 3 -> System.out.println("Character support");
                                }
                            }
                        }
                    }
                }
                case 8 -> System.out.println("Info service");
                case 9 -> System.out.println("Voice mailbox number");
                case 10 -> System.out.println(" Service command editor");
            }
        }

        switch (menu) {
            case 3:
                if (menu == 3) {
                    System.out.println("Chat");
                }
        }

        switch (menu) {
            case 4: {
                if (menu == 4) {
                    System.out.println("Call register" +
                            "1. Missing calls" +
                            "3. Received calls" +
                            "4. Dialled numbers" +
                            "5. Erase recent call lists" +
                            "6. Show call costs" +
                            "7. Call cost settings" +
                            "8. Prepaid credit");
                }
            }
        }

        System.out.println("Enter 1 to open call register: ");
        callRegister = input.nextInt();
        if (callRegister > 1 && callRegister <= 4 ){
            switch (callRegister) {
                case 1 -> System.out.println("Missing calls");
                case 2 -> System.out.println("Received calls");
                case 3 -> System.out.println("Dialled numbers");
                case 4 -> System.out.println("Erase recent call lists");
                case 5 -> {
                    System.out.println("show call costs" +
                            "1. Last call duration" +
                            "2. All calls' duration" +
                            "3. Received calls' duration" +
                            "4. Dialled calls' duration" +
                            "5. Clear timers");

                    System.out.println("Enter 1-5 to show call costs");
                    int callCost = input.nextInt();

                    switch (callCost){
                        case 1 -> System.out.println("Last call duration");
                        case 2 -> System.out.println("All call's duration");
                        case 3 -> System.out.println("Received calls' duration");
                        case 4 -> System.out.println("Dialled calls' duration");
                        case 5 -> System.out.println("Clear timers");
                    }
                }
                case 6 ->{
                    System.out.println("Show call costs" +
                            "1. Last call cost" +
                            "2. All calls' cost" +
                            "3. Clear counters");
                    System.out.println("Enter 1-3 to show call costs");
                    int showCallCost = input.nextInt();
                    switch (showCallCost){
                        case 1 -> System.out.println("Last call cost");
                        case 2 -> System.out.println("All calls' cost");
                        case 3 -> System.out.println("Clear counters");
                    }
                }
                case 7 -> {
                    System.out.println("Call cost settings" +
                            "1. Call cost limit" +
                            "2. Show costs in");
                    System.out.println("Enter 1-2 to call cost settings");
                    int costSettings = input.nextInt();
                    switch (costSettings) {
                        case 1 -> System.out.println("Call cost limits");
                        case 2 -> System.out.println("Show costs in");
                    }
                }
                case 8 -> System.out.println("Prepaid");
            }
        }

//        if (menu > 1 && menu <= 13){
//            switch (menu){
//                if(m)
//            }
//        }




    }
}
