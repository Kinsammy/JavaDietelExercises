package diary;


import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static final Scanner keyboardInput = new Scanner(System.in);
    private static Diary diary;

    public static void main(String[] args) {
        createDiary();
        displayLockMenu();
    }

    private static void createDiary() {
        String mainMenu = """
                Welcome to my Diary!!!
                Let's set it Up!
                """;

        print(mainMenu);

        String username  =   input("Enter your name");
        String password =  input("Enter your password");
        diary = new Diary(username, password);
        print("Diary created for " + username);
    }


    private static void displayLockMenu(){
        String mainMenu = """ 
                Press 1 -> Unlock Diary
                Press 2 -> Lock Diary
                Press 3 -> exit
                """;

        String userInput = input(mainMenu);
        switch (Integer.parseInt(userInput)){
            case 1: unlockDiary();
            case 2: lockDiary();
            case 3: exitApplication();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.lock();
        print("Locked successfully");
        displayLockMenu();
    }

    private static void unlockDiary() {
        String password = input("Enter correct password");
        diary.unlockWith(password);
        if (diary.isLocked()) {
            print("Wrong password");
            displayLockMenu();
        }
        displayDiaryMenu();
    }

    private static void displayDiaryMenu() {
        String diaryMenu = """
                Press 1 -> Create Entry
                Press 2 -> Find Entry by Id
                Press 3 -> Get Total number of entries
                Press 4 -> Lock diary
                """;
        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)){
            case 1 -> createEntry();
            case 2 -> findById();
            case 3 -> getTotalNumberOfEntries();
            case 4 -> lockDiary();
        }
    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntry = diary.numberOfEntries();
        print("You have " + totalNumberOfEntry + "Entries");
        displayDiaryMenu();
    }

    private static void findById() {
        String id = input("Enter the id for the entry you want to find");
        Entry foundEntry = diary.findEntryWith(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDiaryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        diary.write(title, body);
        print("Written successfully");
        displayDiaryMenu();
    }

    private static String input(String prompt){
        print(prompt);
        return keyboardInput.nextLine();
//        return JOptionPane.showInputDialog(null, prompt);
    }

    private static void print(String prompt){
        System.out.println(prompt);
//        JOptionPane.showInputDialog(null, prompt);
    }


}
