package chapter6;

/**
 * You roll two dice. Each die has six faces,
 * which contain one, two, three, four, five and six spots,
 * respectively. After the dice have come to rest,
 * the sum of the spots on the two upward faces is calculated.
 * If the sum is 7 or 11 on the first throw, you win.
 * If the sum is 2, 3 or 12 on the first throw (called “craps”),
 * you lose (i.e., the “house” wins). If the sum is 4, 5, 6, 8, 9 or 10 on the first throw,
 * that sum becomes your “point.” To win,
 * you must continue rolling the dice until you “make your point” (i.e., roll that same point value).
 * You lose by rolling a 7 before making your point
 */

import java.security.SecureRandom;

public class Craps {
    static SecureRandom randomNumber = new SecureRandom();
    static final int DEUX = 2;
    static final int TRICKY = 3;
    static final int SET = 7;
    static final int  LAVAGE= 11;
    static final int DORICE = 12;

    public static int rollDice(){
        int firstDie = 1 + randomNumber.nextInt(6);
        int secondDie = 1 + randomNumber.nextInt(6);
        int dieSum = firstDie + secondDie;
        System.out.printf("Player Rolled %d + %d = %d%n", firstDie, secondDie, dieSum);
        return dieSum;
    }
}
