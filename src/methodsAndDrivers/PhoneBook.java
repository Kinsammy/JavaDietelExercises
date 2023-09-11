//package methodsAndDrivers;
//
//import static methodsAndDrivers.Menu.input;
//
//public class PhoneBook {
//    private int phoneBook;
//
//    public static int phoneBook(){
//        System.out.println("Press 1 to see Phone book menu");
//        int phoneBookMenu = input.nextInt();
//        System.out.println("1. Search");
//        System.out.println("2. Service Nos.");
//        System.out.println("3. Add name");
//        System.out.println("4. Erase");
//        System.out.println("5. Edit");
//        System.out.println("6. Assign tone");
//        System.out.println("7. Send b' card");
//        System.out.println("8. Options");
//        System.out.println("9. Speed dials");
//        System.out.println("10. Voice tags");
//        System.out.println("Choose from 1-10 to pick a menu: ");
//        int phoneBook = input.nextInt();
//        switch (phoneBook) {
//            case 1 -> System.out.println("1. Search");
//            case 2 -> System.out.println("2. Service Nos.");
//            case 3 -> System.out.println("3. Add name");
//            case 4 -> System.out.println("4. Erase");
//            case 5 -> System.out.println("5. Edit");
//            case 6 -> System.out.println("6. Assign tone");
//            case 7 -> System.out.println("7. Send b' card");
//            case 8 -> {
//                System.out.println("8. Options");
//                System.out.println("Press 1 to see Options: ");
//                int opt = input.nextInt();
//                System.out.println("1. Type of view");
//                System.out.println("2. Memory status");
//
//                System.out.println("Select either 1 or 2 to pick an option: ");
//                int options = input.nextInt();
//                switch (options) {
//                    case 1 -> System.out.println("1. Type of view");
//                    case 2 -> System.out.println("2. Memory status");
//                }
//            }
//            case 9 -> System.out.println("9. Speed dials");
//            case 10 -> System.out.println("10. Voice tags");
//        }
//        return phoneBook;
//    }
//}
