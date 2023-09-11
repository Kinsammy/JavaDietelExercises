package chapter4;

import java.util.Scanner;

public class CarGame2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command = "";
        boolean started = false;
        System.out.println("Type help to see Car's manual ");
        label:
        while (true){
            System.out.print("> ");
            command = input.nextLine();
            switch (command) {
                case "help":
                    if (started) {
                        System.out.println("You are in Car Manual.");
                    } else {
                        started = true;
                        System.out.println("""
                                start - to start car
                                stop - to stop car
                                quit - to exit""");
                    }
                    break;
                case "start":
                    if (started) {
                        System.out.println("Car already started!");
                    } else {
                        started = true;
                        System.out.println("Car is started....ready to move.");
                    }
                    break;
                case "stop":
                    if (!started) {
                        System.out.println("Car is already stopped.");
                    } else {
                        started = false;
                        System.out.println("Car is stopped.");
                    }
                    break;
                case "quit":
                    break label;
                default:
                    System.out.println("I don't understand that");
                    break;
            }

        }

    }
}
