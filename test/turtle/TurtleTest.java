package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurtleTest {
    private Turtle ijapa;
    private SketchPad sketchPad;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
        Pen biro = new Pen();
        ijapa.setPen(biro);
        sketchPad = new SketchPad();
    }

    @Test
    public void changePenPosition() {
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPosition());
    }

    @Test
    public void moveForward() {
        assertEquals(0, ijapa.getxCoordinate());
        assertEquals(0, ijapa.getyCoordinate());
        assertEquals(Cardinal.EAST, ijapa.getDirection());
        ijapa.moveForward(7,sketchPad.getFloor());
        assertEquals(6, ijapa.getxCoordinate());
        assertEquals(0, ijapa.getyCoordinate());
        assertEquals(Cardinal.EAST, ijapa.getDirection());
    }

    @Test
    public void changeDirection() {
        assertEquals(Cardinal.EAST, ijapa.getDirection());
        ijapa.setDirection(Cardinal.SOUTH);
        assertEquals(Cardinal.SOUTH, ijapa.getDirection());
    }

    @Test
    public void move() {
        ijapa.moveForward(12, sketchPad.getFloor());
        assertEquals(11, ijapa.getxCoordinate());
        assertEquals(0, ijapa.getyCoordinate());
        assertEquals(Cardinal.EAST, ijapa.getDirection());

        ijapa.moveForward(Cardinal.SOUTH,12, sketchPad.getFloor());
        assertEquals(11, ijapa.getxCoordinate());
        assertEquals(11, ijapa.getyCoordinate());
        assertEquals(Cardinal.SOUTH, ijapa.getDirection());

        ijapa.moveForward(Cardinal.WEST,12, sketchPad.getFloor());
        assertEquals(0, ijapa.getxCoordinate());
        assertEquals(11, ijapa.getyCoordinate());
        assertEquals(Cardinal.WEST, ijapa.getDirection());

        ijapa.moveForward(Cardinal.NORTH,12, sketchPad.getFloor());
        assertEquals(0, ijapa.getxCoordinate());
        assertEquals(0, ijapa.getyCoordinate());
        assertEquals(Cardinal.NORTH, ijapa.getDirection());

        int[][] turtle = sketchPad.getFloor();
        for (int i = 0; i < sketchPad.getFloor().length; i++){
            for (int j = 0; j < sketchPad.getFloor().length; j++){
                if (turtle[i][j] == 1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
//
    }

}
