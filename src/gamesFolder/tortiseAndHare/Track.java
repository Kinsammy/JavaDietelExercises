package gamesFolder.tortiseAndHare;

import java.security.SecureRandom;

public class Track {

    public static final int TRACK_LENGTH = 70;
    public static final int NUMBER_OF_RUNNERS = 2;

    private static SecureRandom random = new SecureRandom();
    private int startPosition;
    private int currentPosition;
    private String runnerTag;
    private int lane;
    private String name;
    private String move;

    public String[][] tracks;

    public Track() {
        tracks = new String[TRACK_LENGTH][NUMBER_OF_RUNNERS];
    }

    public void displayRace(){
        display();
        System.out.printf("%s%4s%4s%n", "Cell", "T", "H");
for (int row = 0; row < TRACK_LENGTH; row++){
            System.out.printf("%d%s", row,   "  |  ");
            for (int column = 0 ; column < NUMBER_OF_RUNNERS; column++ ){
                if (tracks[row][column] == null){
                    System.out.print("  |  ");
                } else {
                    System.out.print(tracks[row][column] + "  |  ");
                }
            }
            System.out.println(" ");
        }

    }

    public void runnerPosition(Runner runner){
        tracks[runner.currentPosition][runner.lane] = null;
        tracks[runner.currentPosition][runner.lane] = runner.runnerTag;
    }

    public void display(){
        System.out.println("BANG !!!!!!!!!\nAND THEY'RE OFF !!!!!!!");
    }




}
