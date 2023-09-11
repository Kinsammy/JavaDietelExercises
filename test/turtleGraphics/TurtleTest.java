package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    private Turtle ijapa;
    @BeforeEach
    public void setUp(){
        Turtle ijapa = new Turtle();
    }

    @Test
    public void turtleExistTest() {
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMoveUpTest() {
        Turtle ijapa = new Turtle();
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMoveDownTest() {
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest() {
        Turtle ijapa = new Turtle();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest() {
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingWestTest() {
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileNorthFacingTest() {
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingEastTest() {
        Turtle ijapa = new Turtle();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }


    @Test
    public void turtleCanTurnLeftWhileFacingNorthTest() {
        Turtle ijapa = new Turtle();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingWestTest() {
        Turtle ijapa = new Turtle();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingSouthTest() {
        Turtle ijapa = new Turtle();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        Turtle ijapa = new Turtle();
        assertEquals(new  Position(0,0), ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanTurnRightAndMoveForwardWhileFacingSSouthTest(){
        Turtle ijapa = new Turtle();
        assertEquals(new  Position(0,0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new Position(5, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanTurnLeftAndMoveForwardWhileFacingSSouthTest(){
        Turtle ijapa = new Turtle();
        assertEquals(new  Position(0,0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
    }

    @Test
    public void arrayFloorSketchPadTest(){
        Turtle ijapa = new Turtle();
        ijapa.createSketchPad(new SketchPad(2, 2));

    }

}
