package patterns.numberPattern;

public class RightMultipleNumbers {
    public static void main(String[] args) {

        for (int row = 1, track = 1; row <= 5; row++, track++){
            for (int col = 1; col <=row; col++){
                System.out.print(track +"  ");
            }
            System.out.println();
        }
    }
}
