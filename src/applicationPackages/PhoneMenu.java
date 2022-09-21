package applicationPackages;

import java.util.Scanner;

public class PhoneMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to see Menu: ");
        int menuList = input.nextInt();
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

        System.out.println("Press 1 - 13 to pick a menu: ");
        int menu = input.nextInt();
        switch (menu) {
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
        if (menu == 1) {
            System.out.println("Choose from 1- 10 to see Phone book menu");
            int phoneBookMenu = input.nextInt();
            System.out.println("1. Search");
            System.out.println("2. Service Nos.");
            System.out.println("3. Add name");
            System.out.println("4. Erase");
            System.out.println("5. Edit");
            System.out.println("6. Assign tone");
            System.out.println("7. Send b' card");
            System.out.println("8. Options");
            System.out.println("9. Speed dials");
            System.out.println("10. Voice tags");

            while (true) {
                System.out.println("Choose from 1-10 to pick a menu: ");
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
                        System.out.println("Press 1 to see Options: ");
                        int opt = input.nextInt();
                        System.out.println("1. Type of view");
                        System.out.println("2. Memory status");

                        System.out.println("Select either 1 or 2 to pick an option: ");
                        int options = input.nextInt();
                        switch (options) {
                            case 1 -> System.out.println("1. Type of view");
                            case 2 -> System.out.println("2. Memory status");
                        }
                    }
                    case 9 -> System.out.println("9. Speed dials");
                    case 10 -> System.out.println("10. Voice tags");
                }
            }
        }

        if (menu == 2) {


            if (menu == 3) {
                System.out.println("Chat");
            }

            if (menu == 4) {
                System.out.println("Press 1 to see Call register menu: ");
                int call = input.nextInt();
                System.out.println("1. Missed calls");
                System.out.println("2. Received calls");
                System.out.println("3. Dialled numbers");
                System.out.println("4. Erase recent call lists");
                System.out.println("5. Show call duration");
                System.out.println("6. Show call costs");
                System.out.println("7. Call cost settings");
                System.out.println("8. Prepaid credit");

                while (true) {
                    System.out.println("Choose from 1-8 to pick call register");
                    int callRegister = input.nextInt();
                    switch (callRegister) {
                        case 1 -> System.out.println("1. Missed calls");
                        case 2 -> System.out.println("2. Received calls");
                        case 3 -> System.out.println("3. Dialled numbers");
                        case 4 -> System.out.println("4. Erase recent call lists");
                        case 5 -> {
                            System.out.println("5. Show call duration");
                            System.out.println("Press 1 to show call duration: ");
                            int callDuration = input.nextInt();
                            System.out.println("1. Last call duration");
                            System.out.println("2. All calls' duration");
                            System.out.println("3. Received calls' duration");
                            System.out.println("4. Dialled calls' duration");
                            System.out.println("5. Clear timers");

                            System.out.println("Choose from 1-5 to show a call duration: ");
                            int showCallDuration = input.nextInt();
                            switch (showCallDuration) {
                                case 1 -> System.out.println("1. Last call duration");
                                case 2 -> System.out.println("2. All calls' duration");
                                case 3 -> System.out.println("3. Received calls' duration");
                                case 4 -> System.out.println("4. Dialled calls' duration");
                                case 5 -> System.out.println("5. Clear timers");
                            }
                        }
                        case 6 -> {
                            System.out.println("6. Show call costs");
                            System.out.println("Press 1 to Show call costs: ");
                            int callCosts = input.nextInt();
                            System.out.println("1. Last call cost");
                            System.out.println("2. All calls' cost");
                            System.out.println("3. Clear timer");

                            System.out.println("Choose from 1-3 to show a  call cost");
                            int showCallCost = input.nextInt();
                            switch (showCallCost) {
                                case 1 -> System.out.println("1. Last call cost");
                                case 2 -> System.out.println("2. All calls' cost");
                                case 3 -> System.out.println("3. Clear timer");
                            }
                        }
                        case 7 -> {
                            System.out.println("7. Call cost settings");
                            System.out.println("Press 1 to see the Call cost settings: ");
                            int callCost = input.nextInt();
                            System.out.println("1. Call cost limit");
                            System.out.println("2. Show costs in");

                            System.out.println("Select either 1 or 2 to pick Call cost settings: ");
                            int callCostSettings = input.nextInt();
                            switch (callCostSettings) {
                                case 1 -> System.out.println("1. Call cost limit");
                                case 2 -> System.out.println("2. Show costs in");
                            }
                        }
                        case 8 -> System.out.println("8. Prepaid credit");
                    }
                }
            }

            if (menu == 5) {
                System.out.println("Press 1 to see Tones menu: ");
                int tonesMenu = input.nextInt();
                System.out.println("1. Ringing tone");
                System.out.println("2. Ringing volume");
                System.out.println("3. Incoming call alert");
                System.out.println("4. Composer");
                System.out.println("5. Message alert tone");
                System.out.println("6. Keypad tones");
                System.out.println("7. Warning and game tones");
                System.out.println("8. Vibrating alert");
                System.out.println("9. Screen saver");

                while (true) {
                    System.out.println("Choose from 1-9 to pick a Tone menu: ");
                    int tones = input.nextInt();
                    switch (tones) {
                        case 1 -> System.out.println("1. Ringing tone");
                        case 2 -> System.out.println("2. Ringing volume");
                        case 3 -> System.out.println("3. Incoming call alert");
                        case 4 -> System.out.println("4. Composer");
                        case 5 -> System.out.println("5. Message alert tone");
                        case 6 -> System.out.println("6. Keypad tones");
                        case 7 -> System.out.println("7. Warning and game tones");
                        case 8 -> System.out.println("8. Vibrating alert");
                        case 9 -> System.out.println("9. Screen saver");
                    }
                }
            }

            if (menu == 6) {
                System.out.println("Press 1 to see Setting lists: ");
                int settingList = input.nextInt();
                System.out.println("1. Call settings");
                System.out.println("2. Phone settings");
                System.out.println("3. Security settings");
                System.out.println("4. Restore factory settings");
                System.out.println("Choose from 1-4 to pick a Setting: ");
                int settings = input.nextInt();
                switch (settings) {
                    case 1 -> {
                        System.out.println("1. Call settings");
                        System.out.println("Press 1 to see Call settings: ");
                        int call = input.nextInt();
                        System.out.println("1. Automatic redial");
                        System.out.println("2. Speed dialling");
                        System.out.println("3. Call waiting options");
                        System.out.println("4. Own number sending");
                        System.out.println("5. Phone line in use");
                        System.out.println("6. Automatic answer");

                        System.out.println("Choose from 1-6 to pick a Call settings: ");
                        int callSetting = input.nextInt();
                        switch (callSetting) {
                            case 1 -> System.out.println("1. Automatic redial");
                            case 2 -> System.out.println("2. Speed dialling");
                            case 3 -> System.out.println("3. Call waiting options");
                            case 4 -> System.out.println("4. Own number sending");
                            case 5 -> System.out.println("5. Phone line in use");
                            case 6 -> System.out.println("6. Automatic answer");
                        }
                    }
                    case 2 -> {
                        System.out.println("2. Phone settings");
                        System.out.println("Press 1 to see Phone settings: ");
                        int phone = input.nextInt();
                        System.out.println("1. Language");
                        System.out.println("2. Cell info display");
                        System.out.println("3. Welcome note");
                        System.out.println("4. Network selection");
                        System.out.println("5. Lights");
                        System.out.println("6. Confirm SIM service actions");

                        System.out.println("Choose from 1-6 to pick a phone setting: ");
                        int phoneSettings = input.nextInt();
                        switch (phoneSettings) {
                            case 1 -> System.out.println("1. Language");
                            case 2 -> System.out.println("2. Cell info display");
                            case 3 -> System.out.println("3. Welcome note");
                            case 4 -> System.out.println("4. Network selection");
                            case 5 -> System.out.println("5. Lights");
                            case 6 -> System.out.println("6. Confirm SIM service actions");
                        }
                    }
                    case 3 -> {
                        System.out.println("3. Security settings");
                        System.out.println("Press 1 to see Security settings: ");
                        int security = input.nextInt();
                        System.out.println("1. PIN code request");
                        System.out.println("2. Call barring service");
                        System.out.println("3. Fixed dialling");
                        System.out.println("4. Closed user group");
                        System.out.println("5. Phone security");
                        System.out.println("6. Change access codes");

                        System.out.println("Choose from 1-6 to pick a Security setting: ");
                        int securitySettings = input.nextInt();
                        switch (securitySettings) {
                            case 1 -> System.out.println("1. PIN code request");
                            case 2 -> System.out.println("2. Call barring service");
                            case 3 -> System.out.println("3. Fixed dialling");
                            case 4 -> System.out.println("4. Closed user group");
                            case 5 -> System.out.println("5. Phone security");
                            case 6 -> System.out.println("6. Change access codes");
                        }

                    }
                    case 4 -> System.out.println("4. Restore factory settings");
                }
            }

            if (menu == 7) {
                System.out.println("Call divert");
            }

            if (menu == 8) {
                System.out.println("Games");
            }

            if (menu == 9) {
                System.out.println("Calculator");
            }

            if (menu == 10) {
                System.out.println("Reminders");
            }

            if (menu == 11) {
                System.out.println("Press 1 to see the Clock lists: ");
                int clockLists = input.nextInt();
                System.out.println("1. Alarm clock");
                System.out.println("2. Clock settings");
                System.out.println("3. Date setting");
                System.out.println("4. Stopwatch");
                System.out.println("5. Countdown timer");
                System.out.println("6. Auto update of date and time");

                System.out.println("Choose from 1-6 to pick a Clock list: ");
                int clock = input.nextInt();
                switch (clock) {
                    case 1 -> System.out.println("1. Alarm clock");
                    case 2 -> System.out.println("2. Clock settings");
                    case 3 -> System.out.println("3. Date setting");
                    case 4 -> System.out.println("4. Stopwatch");
                    case 5 -> System.out.println("5. Countdown timer");
                    case 6 -> System.out.println("6. Auto update of date and time");
                }

            }

            if (menu == 12) {
                System.out.println("Profiles");
            }

            if (menu == 13) {
                System.out.println("SIM services");
            }

        }
    }

}


