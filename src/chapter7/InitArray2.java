package chapter7;

public class InitArray2 {
    public static void main(String[] args) {

        int[] array2 = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        System.out.println("Using an Array initializer");
        System.out.printf("%s%8s%n", "Index", "Value");
        for(int counter = 0; counter <= array2.length; counter++){
            System.out.printf("%5d%8d%n", counter, array2[counter]);
        }
    }
}
