package chapter7;

public class PassArrayMethod {
    public static void modifyArray(int[] numbers){
        for (int counter = 0; counter < numbers.length; counter++){
            numbers[counter] *= 2;
        }
    }

    public static void modifyElement(int elment){
        elment *= 2;
        System.out.printf("Value of element in modifyElement: %d%n", elment);
    }
}
