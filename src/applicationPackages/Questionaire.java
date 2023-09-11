package applicationPackages;

import java.util.Objects;
import java.util.Scanner;

public class Questionaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int optionA = 0;
        int optionB = 0;
        while (true){
            System.out.println("What is your name? ");
            String name  = input.next();
            System.out.println("""
                    A. active, initiate                 B. reflective, deliberate
                    """);
            optionA++;
            String option = input.next();
            if (Objects.equals(option, "A")) {
                System.out.println("""
                        A. organized, orderly           B.tactful, kind, encouraging
                        """);
                optionA ++;
            }
            else {

            }


        }
    }
}
