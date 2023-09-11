package patterns.numberPattern;

public class HillMultipleNumbers {
    public static void main(String[] args) {

        for (int row = 1, track = 1; row <= 5; row++, track++){
            for (int col =row; col <= 5; col++){
                System.out.print("   ");
            }
            for (int mark = 1; mark <= row; mark++){
                System.out.print(track + "  ");
            }
            for (int star = 1; star < row; star++){
                System.out.print(track + "  ");
            }
            System.out.println();
        }
    }
}
