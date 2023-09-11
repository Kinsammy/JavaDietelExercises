package applicationPackages;

import java.util.Scanner;

import static java.lang.System.out;

public class QuestionnaireMethod {
    static Scanner input = new Scanner(System.in);
    public static void print(String text){
        out.println(text);
    }

    public static void input(String text){
        input.nextLine();
    }

    public static String firstQuestion(){
        print("""
                A. active, initiate                 B. reflective, deliberate
                """);
        return null;
    }
}
