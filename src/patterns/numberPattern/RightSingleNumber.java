package patterns.numberPattern;

public class RightSingleNumber {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row ++){
            for (int col = 1; col <= row; col++){
                System.out.print(1+ " ");
            }
            System.out.println();
        }
    }
}
