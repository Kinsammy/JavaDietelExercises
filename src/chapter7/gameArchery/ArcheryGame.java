package chapter7.gameArchery;

public class ArcheryGame {
    private Player[] players;

    public ArcheryGame(){}
    public ArcheryGame(int numberOfArchers) {
        players = new Player[numberOfArchers];
        for (int index = 0; index < numberOfArchers; index++) {
            players[index] = new Player();
        }
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }

    public static void addPlayer(int numberOfArchery) {

    }
}
