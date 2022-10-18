package chapter4;

import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command = "";
        boolean started = false;
        System.out.println("Type help to see Car's manual ");
        while (true){
            System.out.print("> ");
            command = input.nextLine();
            if (command.equals("help")){
                if (started){
                    System.out.println("You are in Car Manual.");
                }
                else {
                    started = true;
                    System.out.println("""
                            start - to start car
                            stop - to stop car
                            quit - to exit""");
                }
            } else if (command.equals("start")) {
                if (started){
                    System.out.println("Car already started!");
                }
                else {
                    started = true;
                    System.out.println("Car is started....ready to move.");
                }
            } else if (command.equals("stop")) {
                if (!started){
                    System.out.println("Car is already stopped.");
                }
                else {
                    started = false;
                    System.out.println("Car is stopped.");
                }
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("I don't understand that");
            }

        }

    }
}
