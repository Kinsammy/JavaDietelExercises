package applicationPackages;

import java.util.Scanner;

public class MyersApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();


        for(int questionNo = 1; questionNo <= 20; questionNo++){
            switch (questionNo){
                case 1-> MyersBriggs.questionOne();
                case 2 -> MyersBriggs.questionTwo();
                case 3 -> MyersBriggs.questionThree();
                case 4 -> MyersBriggs.questionFour();
                case 5 -> MyersBriggs.questionFive();
                case 6 -> MyersBriggs.questionSix();
                case 7 -> MyersBriggs.questionSeven();
                case 8-> MyersBriggs.questionEight();
                case 9 -> MyersBriggs.questionNine();
                case 10 -> MyersBriggs.questionTen();
                case 11 -> MyersBriggs.questionEleven();
                case 12 -> MyersBriggs.questionTwelve();
                case 13 -> MyersBriggs.questionThirteen();
                case 14 -> MyersBriggs.questionFourteen();
                case 15-> MyersBriggs.questionFifteen();
                case 16 -> MyersBriggs.questionSixteen();
                case 17 -> MyersBriggs.questionSeventeen();
                case 18 -> MyersBriggs.questionEighteen();
                case 19 -> MyersBriggs.questionNineteen();
                case 20 -> MyersBriggs.questionTwenty();
            }

        }
        System.out.println(" ".repeat(4));
        System.out.printf("%s \t %s\t %s \t %s",MyersBriggs.getColumnOne(),MyersBriggs.getColumnTwo(),
                MyersBriggs.getColumnThree(),MyersBriggs.getColumnFour());
    }
}
