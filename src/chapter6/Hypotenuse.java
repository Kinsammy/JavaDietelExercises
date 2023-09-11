package chapter6;
import static java.lang.Math.*;

public class Hypotenuse {


    public static int getFirstSquare(double firstSide) {
        return (int) Math.pow(firstSide, 2);
    }

    public static int getSecondSquare(double secondSide) {
        return (int) Math.pow(secondSide, 2);
    }

    public static double getHypotenuse(double firstSide, double secondSide) {
        return sqrt(getFirstSquare(firstSide) + getSecondSquare(secondSide));
    }
}
