package patterns.numberPattern;

public class LeftSingleNumber {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("   ");
            }
            for (int mark = row; mark <= 5; mark++){
                System.out.print(1 + "  ");
            }
            System.out.println();
        }
    }
}
