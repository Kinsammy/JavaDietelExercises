//package ticTacToeGame;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class TicTacToe {
//    static Scanner input = new Scanner(System.in);
//
//    private static char[][] gameBoard;
//    static ArrayList<Integer> playerPosition = new ArrayList<>();
//    static ArrayList<Integer> cpuPosition = new ArrayList<>();
//
//
//
//    public static void gameInterface(){
//        char[][] gameBoard = {
//                                {' ', '|', ' ', '|', ' '},
//                                {'-', '+', '-', '+', '-'},
//                                {' ', '|', ' ', '|', ' '},
//                                {'-', '+', '-', '+', '-'},
//                                {' ', '|', ' ', '|', ' '}
//        };
//        printGameBoard(gameBoard);
//
//        while (true) {
//            System.out.println("Enter your placement between 1 and 9: ");
//            int position = input.nextInt();
//
//            placeMark(gameBoard, position, "player");
//            placeMark(gameBoard, position, "cpu");
//
//        }
//    }
//
//    public static void printGameBoard(char[][] game){
//        for(char[] row : game){
//            for (char column: row){
//                System.out.print(column);
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static void placement(){
//        System.out.print("Enter your placement: ");
//        int position = input.nextInt();
//    }
//
//    public static void placeMark(char[][] gameBoard, int position, String user) {
//        char symbol = ' ';
//        if (user.equals("Player")) {
//            symbol = 'X';
//        } else if (user.equals("cpu")) {
//            symbol = 'O';
//        }
//
//            switch (position) {
//                case 1 -> gameBoard[0][0] = 'X';
//                case 2 -> gameBoard[0][2] = 'X';
//                case 3 -> gameBoard[0][4] = 'X';
//                case 4 -> gameBoard[2][0] = 'X';
//                case 5 -> gameBoard[2][2] = 'X';
//                case 6 -> gameBoard[2][4] = 'X';
//                case 7 -> gameBoard[4][0] = 'X';
//                case 8 -> gameBoard[4][2] = 'X';
//                case 9 -> gameBoard[4][4] = 'X';
//                default -> {
//                }
//            }
//            printGameBoard(gameBoard);
//
//
//
//    }
//
//    public static GameStatus checkWinner() {
//        List<Integer> topRow = Arrays.asList(1, 2, 3);
//        List<Integer> middleRow = Arrays.asList(4, 5, 6);
//        List<Integer> bottomRow = Arrays.asList(7, 8, 9);
//        List<Integer> leftColumn = Arrays.asList(1, 4, 7);
//        List<Integer> middleColumn = Arrays.asList(2, 5, 8);
//        List<Integer> rightColumn = Arrays.asList(3, 6, 9);
//        List<Integer> backwardDiagonal = Arrays.asList(1, 5, 9);
//        List<Integer> forwardDiagonal = Arrays.asList(3, 5, 7);
//
//        List<List> winningList = new ArrayList<>();
//        winningList.add(topRow);
//        winningList.add(middleRow);
//        winningList.add(bottomRow);
//        winningList.add(leftColumn);
//        winningList.add(middleColumn);
//        winningList.add(rightColumn);
//        winningList.add(backwardDiagonal);
//        winningList.add(forwardDiagonal);
//
//        for (List list : winningList) {
//            if (playerPosition.containsAll(list)){
//                return GameStatus.WON;
//            } else if () {
//
//            }
//        }
//        return null;
//    }
//}
//
//
