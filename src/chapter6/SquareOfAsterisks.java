package chapter6;

public class SquareOfAsterisks {

    public static String  squareOfAsterisks(int size){
        for (int row = 1; row <= size; row++){
            for (int column = 1; column <= size; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return null;
    }

    public static String squareOfAsterisksModify(int rowSize, int columnSize){
        for (int row = 1; row <= rowSize; row++){
            for (int column = 1; column <= columnSize; column++){
                System.out.print("# ");
            }
            System.out.println();
        }
        return null;
    }
}
