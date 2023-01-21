package patterns.numberPattern;

public class HillSingleNumber {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++){
            for (int col =row; col <= 5; col++){
                System.out.print("   ");
            }
            for (int mark = 1; mark <= row; mark++){
                System.out.print(1 + "  ");
            }
            for (int star = 1; star < row; star++){
                System.out.print(1 + "  ");
            }
            System.out.println();
        }

    }
}
