package chapter6;

public class FloorAndCeil {

    public static int myFloor(double num){
        double largest = 0;
        if (num > largest)
            largest = num;
        return (int) num;
    }

    public static int myCeil(double num){
        int smallest = 0;
        if (num > smallest)
            smallest = (int) num;
        return smallest;
    }
}
