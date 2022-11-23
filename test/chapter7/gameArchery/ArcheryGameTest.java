package chapter7.gameArchery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryGameTest {
    private ArcheryGame game;
//    private Player player;

    @BeforeEach
    public void setUp(){
        game = new ArcheryGame(3);
//        player = new Player();
        game = new ArcheryGame();

    }

    @Test
    public void testThatArcheryGameExists(){
        assertNotNull(game);
    }

//    @Test
//    public void testThatPlayerCanExistInArcheryGame() {
//        assertNotNull(player);
//    }

    @Test
    public void testThatPlayerCanBeInArcheryGame() {
        Player[] players = game.getPlayers();
        assertNotNull(players);
        assertTrue(players.length > 0);
    }

    @Test
    public void testThatGameHasPlayer(){
        Player[] players = game.getPlayers();
        Player player = players[0];
        assertNotNull(player);
    }
}