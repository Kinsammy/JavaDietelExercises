package turtle;

public class Turtle {
    private int xCoordinate;
    private int yCoordinate;
    private Cardinal direction = Cardinal.EAST;
    private Pen pen;

    public Turtle(){}

    public Turtle(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
    }

    public Turtle(int x, int y, Cardinal direction) {
        this(x, y);
        this.direction = direction;
    }

    public void changePenPosition(PenPosition position) {

    }

//    public void changeDirection(PenP position) {
//
//    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }


    public void moveForward(int numberOfStep, int[][] number) {
        if (direction.equals(Cardinal.EAST)){
            this.xCoordinate += numberOfStep - 1;
        }
    }

    public void moveForward(Cardinal movement, int numberOfStep, int[][] floor) {
        this.setDirection(movement);
        if (direction.equals(Cardinal.EAST)){
            if (PenPosition.DOWN.equals(getPen().getPosition())){
                for (int i = 0; i < numberOfStep; i++){
                    floor[xCoordinate][yCoordinate] = 1;
                    xCoordinate++;
                }
            }
//            this.xCoordinate += numberOfStep - 1;
        }
        else if (direction.equals(Cardinal.SOUTH)){
            if (PenPosition.DOWN.equals(getPen().getPosition())){
                for (int i = 0; i < numberOfStep; i++){
                    floor[xCoordinate][yCoordinate] = 1;
                    yCoordinate++;
                }
                yCoordinate--;
            }
            yCoordinate++;
//            this.yCoordinate += numberOfStep - 1;
        }
        else if (direction.equals(Cardinal.WEST)){
            if (PenPosition.DOWN.equals(getPen().getPosition())){
                for (int i = 0; i < numberOfStep; i++){
                    floor[xCoordinate][yCoordinate] = 1;
                    xCoordinate--;
                }
            }
//            this.yCoordinate += numberOfStep - 1;
        }

        else if (direction.equals(Cardinal.NORTH)){
            if (PenPosition.DOWN.equals(getPen().getPosition())){
                for (int i = 0; i < numberOfStep; i++){
                    floor[xCoordinate][yCoordinate] = 1;
                    yCoordinate--;
                }
            }
        }
    }
}
