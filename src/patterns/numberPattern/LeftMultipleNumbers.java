package patterns.numberPattern;

public class LeftMultipleNumbers {
    public static void main(String[] args) {

        for (int row = 1, track = 1; row <= 5; row++, track++){
            for (int col = 1; col <= row; col++){
                System.out.print("   ");
            }
            for (int mark = row; mark <= 5; mark++){
                System.out.print(track + "  ");
            }
            System.out.println();
        }
    }
}
