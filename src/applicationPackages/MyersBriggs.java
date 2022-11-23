package applicationPackages;

public class MyersBriggs{
    static int columnOneA = 0;
    static int columnOneB = 0;
    static int columnTwoA = 0;
    static int columnTwoB = 0;
    static int columnThreeA = 0;
    static int columnThreeB = 0;
    static int columnFourA = 0;
    static int columnFourB = 0;

    private static String columnOne;
    private static String columnTwo;
    private static String columnThree;
    private static String columnFour;

    public static void questionOne(){
        String one = MyersBriggsQuestionnaire.question1();
        if(one.equals("A")) columnOneA++;
        else columnOneB++;
    }
    public static void questionTwo(){
        String two = MyersBriggsQuestionnaire.question2();
        if(two.equals("A")){
            columnTwoA++;
        }
        else columnTwoB++;
    }
    public static void questionThree(){
        String three = MyersBriggsQuestionnaire.question3();
        if(three.equals("A")){
            columnThreeA++;
        }
        else columnThreeB++;
    }

    public static void questionFour(){
        String four = MyersBriggsQuestionnaire.question4();
        if(four.equals("A")) columnFourA++;
        else columnFourB++;
    }

    public static void questionFive(){
        String five = MyersBriggsQuestionnaire.question5();
        if(five.equals("A")) columnOneA++;
        else columnOneB++;
    }

    public static void questionSix(){
        String six = MyersBriggsQuestionnaire.question6();
        if(six.equals("A")) columnTwoA++;
        else columnTwoB++;
    }

    public static void questionSeven(){
        String seven = MyersBriggsQuestionnaire.question7();
        if(seven.equals("A")) columnThreeA++;
        else columnThreeB++;
    }

    public static void questionEight(){
        String eight = MyersBriggsQuestionnaire.question8();
        if(eight.equals("A")) columnFourA++;
        else columnFourB++;
    }

    public static void questionNine(){
        String nine = MyersBriggsQuestionnaire.question9();
        if(nine.equals("A")) columnOneA++;
        else columnOneB++;
    }

    public static void questionTen(){
        String ten = MyersBriggsQuestionnaire.question10();
        if(ten.equals("A")) columnTwoA++;
        else columnTwoB++;
    }

    public static void questionEleven(){
        String eleven = MyersBriggsQuestionnaire.question11();
        if(eleven.equals("A")) columnThreeA++;
        else columnThreeB++;
    }

    public static void questionTwelve(){
        String twelve =MyersBriggsQuestionnaire.question12();
        if(twelve.equals("A")) columnFourA++;
        else columnFourB++;
    }

    public static void questionThirteen(){
        String thirteen = MyersBriggsQuestionnaire.question13();
        if(thirteen.equals("A")) columnOneA++;
        else columnOneB++;
    }

    public static void questionFourteen(){
        String fourteen = MyersBriggsQuestionnaire.question14();
        if(fourteen.equals("A")) columnTwoA++;
        else columnTwoB++;
    }

    public static void questionFifteen(){
        String fifteen = MyersBriggsQuestionnaire.question15();
        if(fifteen.equals("A")) columnThreeA++;
        else columnThreeB++;
    }

    public static void questionSixteen(){
        String sixteen = MyersBriggsQuestionnaire.question16();
        if(sixteen.equals("A")) columnFourA++;
        else columnFourB++;
    }

    public static void questionSeventeen(){
        String seventeen =MyersBriggsQuestionnaire.question17();
        if(seventeen.equals("A")) columnOneA++;
        else columnOneB++;
    }

    public static void questionEighteen(){
        String eighteen = MyersBriggsQuestionnaire.question18();
        if(eighteen.equals("A")) columnTwoA++;
        else columnTwoB++;
    }
    public static void questionNineteen(){
        String nineteen = MyersBriggsQuestionnaire.question19();
        if(nineteen.equals("A")) columnThreeA++;
        else columnThreeB++;
    }

    public static void questionTwenty(){
        String twenty = MyersBriggsQuestionnaire.question20();
        if(twenty.equals("A")) columnFourA++;
        else columnFourB++;
    }

    public static String getColumnOne(){
        if(columnOneA > columnOneB) columnOne = "E";
        else columnOne = "I";
        return columnOne;
    }
    public static String getColumnTwo(){
        if(columnTwoA > columnTwoB) columnTwo = "S";
        else columnTwo = "N";
        return columnTwo;
    }

    public static String getColumnThree(){
        if(columnThreeA > columnThreeB) columnThree = "T";
        else columnThree = "F";
        return columnThree;
    }

    public static String getColumnFour(){
        if(columnFourA > columnFourB) columnFour = "J";
        else columnFour = "P";
        return columnFour;
    }


}
