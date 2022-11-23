package chapter6;

public class FloorAndCeil {

    public static int myFloor(double num){
        double largest = 0;
        for (int index = 0; index <= num; index++){
            if (index > largest) {
                largest = index;
                break;
            }
        }

        return (int) largest;
    }

    public static int myCeil(double num){
        double smallest = 0;

        for (int index = 0; index <= num; index++ ){
            if (index < smallest) {
                smallest = index;
                break;
            }
        }

        return (int) smallest;
    }
}
