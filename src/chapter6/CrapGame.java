//package chapter6;
//
//import java.security.SecureRandom;
//import java.util.Scanner;
//
//public class CrapGame {
//    private static final SecureRandom randomNumbers = new SecureRandom();
//    private enum Status {CONTINUE, WON, LOST};
//    private static final int DON = 2;
//    private static final int TREY = 3;
//    private static final int SEVEN =7;
//    private static final int YO_LEVEN = 11;
//    private static final int JACKPOT = 12;
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter name to continue");
//        String name = input.nextLine();
//        player.setName(name);
//        System.out.println("Enter age to continue");
//        int age = input.nextInt();
//        player.setAge(age);
//
//        if(age >= 18) {
//            System.out.println("GAME INSTRUCTION\n In the game, you will roll 2 dice. The dice have 6 different sides with numbers between 1 to 6.\n The combination of your dice will be summed (between 2 to 12). If you get 3 or 12, you win;\n if you get 2, 7, 11 or 8, you lose, however, if you get 4,5,6,9,10, you have the chance to roll\n the dice for another 3 times, and if you roll your previous number or the number 7, you win. Else, you lose.\n Good Luck!");
//            System.out.println("\nPress 1 to continue or any number to exit");
//            int cont = input.nextInt();
//
//            if(cont == 1) {
//                System.out.println("\nMake deposit to continue. Minimum of #500");
//                double money = input.nextDouble();
//                player.deposit(money);
//                double win = money * 3;
//
//                if (money >= 500) {
//                    int myPoint = 0;
//                    Status gameStatus;
//                    int sumOfDice = rollDice();
//
//
//                    switch (sumOfDice) {
//                        case TREY, JACKPOT -> {
//                            gameStatus = Status.WON;
//                            break;
//                        }
//                        case SEVEN, DON, YO_LEVEN -> {
//                            gameStatus = Status.LOST;
//                            break;
//                        }
//                        default -> {
//                            gameStatus = Status.CONTINUE;
//                            myPoint = sumOfDice;
//                            System.out.printf("Point is %d%n", myPoint);
//                            break;
//                        }
//                    }
//                    for (int i = 1; i <= 3; i++) {
//                        System.out.println("\nPress 1 to try once more or any other number to exit");
//                        int reply = input.nextInt();
//                        if (reply == 1) {
//                            sumOfDice = rollDice();
//                            if (sumOfDice == myPoint) {
//                                gameStatus = Status.WON;
//                                break;
//                            }
//                            if (sumOfDice == SEVEN) {
//                                gameStatus = Status.LOST;
//                                break;
//                            } else {
//                                System.out.printf("Point is %d%n", sumOfDice);
//                            }
//                        }
//                    }
//                    if (gameStatus == Status.WON) {
//
//                        System.out.printf("%nCongratulations %s. You won!", name);
//                        System.out.printf("%nYou won %.2f%n", win);
//                    } else {
//                        System.out.printf("%nSorry %s. %nYou lost!%n", name);
//                        System.out.println("\nDeposit to play again");
//                    }
//                }
//            }
//        }
//    }
//
//    public static int rollDice() {
//        int die1 = 1 + randomNumbers.nextInt(6);
//        int die2 = 1 + randomNumbers.nextInt(6);
//        int sum = die1 + die2;
//        System.out.printf("%nYour first die was %d %nYour second die was %d", die1, die2);
//        System.out.printf("%nTherefore, you rolled %d + %d = %d%n", die1, die2, sum);
//        return sum;
//    }
//}
