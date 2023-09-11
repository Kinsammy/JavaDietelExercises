package gamesFolder.tortiseAndHare;

import java.security.SecureRandom;

public class Runner extends Track {
    private static SecureRandom random = new SecureRandom();
    private int startPosition;
    public int currentPosition;
    public String runnerTag;
    public int lane;
    private String name;
    private String move;

    public int getMoveType(){
        return random.nextInt(100);
    }

    public void makeMove(int step){
        startPosition = currentPosition;
        if (currentPosition + step < 0){
            currentPosition = 0;
        } else if (currentPosition + step > Track.TRACK_LENGTH) {
            currentPosition = Track.TRACK_LENGTH;
        } else {
            currentPosition += step;
        }
    }

    public boolean isWinner(Runner runner){
        if (runner.currentPosition == Track.TRACK_LENGTH){
            return true;
        }
        return false;
    }

    public void calculateMove(){

    }
}
