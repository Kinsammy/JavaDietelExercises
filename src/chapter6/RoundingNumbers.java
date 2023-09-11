package chapter6;

public class RoundingNumbers {


    public static double roundToInteger(double number){
        return  Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number){
        return  Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number){
        return  Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandth(double number){
        return  Math.floor(number * 1000 + 0.5) / 1000;
    }
}
