package chapter7;

public class PrintingRowAndColumn {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];

        System.out.printf("%s%-7s%-7s", "Java", "Python", "Golang");
        for (int row = 0; row < numbers.length; row++){
            System.out.printf("%nStudent %s", row);
            for (int column = 0; column < numbers.length; column++){
                System.out.print(numbers[row][column]);
            }
            System.out.println();
        }
    }
}
