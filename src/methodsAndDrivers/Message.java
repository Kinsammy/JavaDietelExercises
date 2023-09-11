package methodsAndDrivers;

import static methodsAndDrivers.Menu.input;

public class Message {

    private int message;

    public static int message(){
        System.out.println("1. Write messages");
        System.out.println("2. Inbox");
        System.out.println("3. Outbox");
        System.out.println("4. Picture messages");
        System.out.println("5. Templates");
        System.out.println("6. Smileys");
        System.out.println("7. Message settings");
        System.out.println("8. Info service");
        System.out.println("9. Voice mailbox number");
        System.out.println("10. Service command editor");
        System.out.println("Choose from 1- 10 to pick a Messages menu: ");
        int messages = input.nextInt();
        switch (messages) {
            case 1 -> System.out.println("1. Write messages");
            case 2 -> System.out.println("2. Inbox");
            case 3 -> System.out.println("3. Outbox");
            case 4 -> System.out.println("4. Picture messages");
            case 5 -> System.out.println("5. Templates");
            case 6 -> System.out.println("6. Smileys");
            case 7 -> {
                System.out.println("7. Message settings");
                System.out.println("Press 1 to see Message settings menu");
                int messageSettingMenu = input.nextInt();
                System.out.println("1. Set");
                System.out.println("2. Common");
                System.out.println("Select 1 or 2 to pick a list");
                int messageSettings = input.nextInt();
                switch (messageSettings) {
                    case 1 -> {
                        System.out.println("1. Set");
                        System.out.println("Press 1 to see Set lists: ");
                        int setList = input.nextInt();
                        System.out.println("1. Message centre number");
                        System.out.println("2. Message sent as");
                        System.out.println("3. Message validity");
                        System.out.println("Choose from 1-3 to pick a set list");
                        int sets = input.nextInt();
                        switch (sets){
                            case 1 -> System.out.println("1. Message centre number");
                            case 2 -> System.out.println("2. Message sent as");
                            case 3 -> System.out.println("3. Message validity");
                        }
                    }
                    case 2 -> {
                        System.out.println("2. Common");
                        System.out.println("Press 1 to see Common lists: ");
                        int commonList = input.nextInt();
                        System.out.println("1. Delivery reports");
                        System.out.println("2. Reply via same centre");
                        System.out.println("3. Character support");
                        System.out.println("Choose from 1-3 to pick a Common list: ");
                        int common = input.nextInt();
                        switch (common) {
                            case 1 -> System.out.println("1. Delivery reports");
                            case 2 -> System.out.println("2. Reply via same centre");
                            case 3 -> System.out.println("3. Character support");
                        }
                    }
                }
            }
            case 8 -> System.out.println("8. Info service");
            case 9 -> System.out.println("9. Voice mailbox number");
            case 10 -> System.out.println("10. Service command editor");
        }
        return messages;
    }
}
