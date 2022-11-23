package sketchPad;

public class SketchPadMethod {
    private final int[][] sketchPad;

    public SketchPadMethod(int row, int column) {
        sketchPad = new int[row][column];
    }

    public int[][] getSketchPad() {
        return sketchPad;
    }
}
