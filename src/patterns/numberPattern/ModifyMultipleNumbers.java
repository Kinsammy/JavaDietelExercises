package patterns.numberPattern;

public class ModifyMultipleNumbers {
    public static void main(String[] args) {

        for (int row = 1, track = 1; row<= 5; row++, track++){
            for (int col = 1; col <=row; col++){
                if (row % 2 == 0){
                    System.out.print(2 + "  ");
                } else {
                    System.out.print(1 + "  ");
                }
            }
            System.out.println();
        }
    }
}
