package turtleGraphics;

public class Position {
    private int row;
    private int column;
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

//    @Override
//    public String toString() {
//        return "Position{" +
//                "row=" + row +
//                ", column=" + column +
//                '}';
//    }

    @Override
    public String toString() {
        String toBeReturned = "";
        toBeReturned += "row =" + row + "\n";
        toBeReturned += "column=" + column + "\n";
        return toBeReturned;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o){
        Position compared = (Position) o;
        return compared.row == this.row && compared.column == this.column;
    }
}
