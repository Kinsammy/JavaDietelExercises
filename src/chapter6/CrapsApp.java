package chapter6;

import static chapter6.Craps.*;

public class CrapsApp {
    public static void main(String[] args) {
        Status gameStatus;
        int myPoint = 0;
        int sumOfDice = rollDice();

        switch (sumOfDice){
            case DEUX: case SET:
                gameStatus = Status.WON;
                break;
            case TRICKY: case LAVAGE: case DORICE :
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                break;
        }
        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();
            if (sumOfDice == myPoint){
                gameStatus = Status.WON;
            }
            else {
                if (sumOfDice == SET){
                    gameStatus = Status.LOST;
                }
            }
        }
        if (gameStatus == Status.WON){
            System.out.printf("Player wins with point %d", myPoint);
        }
        else {
            System.out.printf("Player loses with point %d", myPoint);
        }
    }
}
