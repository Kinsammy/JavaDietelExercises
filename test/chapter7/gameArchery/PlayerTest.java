package chapter7.gameArchery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {
    private Player player = new Player();;

    @BeforeEach
    public void setUp(){
        player = new Player();
    }

    @Test
    public void testThatPlayerCanBeCreated() {
        assertNotNull(player);
    }



}
