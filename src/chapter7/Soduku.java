package chapter7;

public class Soduku {
    public static void main(String[] args) {
        int[][] elements = {
                            {1, 2, 3, 4, 5, 6, 7, 8, 9},
                            {2, 1, 4, 5, 6, 7, 8, 9, 3},
                            {3, 4, 1, 6, 7, 8, 9, 2, 5},
                            {4, 5, 6, 7, 9, 3, 2, 1, 8},
                            {5, 6, 9, 8, 2, 1, 3, 4, 7},
                            {6, 7, 8, 9, 1, 4, 5, 3, 2},
                            {7, 8, 2, 1, 3, 9, 6, 5, 4},
                            {8, 9, 5, 3, 4, 2, 1, 7, 6},
                            {9, 3, 7, 2, 8, 5, 4, 6, 1}
                            };

        for (int number = 0; number < elements.length; number++){
            for (int index = 0; index < elements[number].length; index++){
                System.out.printf("%d       ", elements[number][index]);
            }
            System.out.println();

        }
    }
}
