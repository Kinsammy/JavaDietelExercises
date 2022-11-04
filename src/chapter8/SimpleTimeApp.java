package chapter8;

public class SimpleTimeApp {
    public static void main(String[] args){
        SimpleTime time = new SimpleTime(13, 30, 19);
        System.out.println(time.buildingString());
    }
}
