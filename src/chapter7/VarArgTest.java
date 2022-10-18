package chapter7;

public class VarArgTest {

    public static double average(double... numbers){
        double total = 0.0;

        for (double value : numbers){
            total += value;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        double value1 = 20.0;
        double value2 = 30.0;
        double value3 = 30.0;
        double value4 = 40.0;

        System.out.printf("Value1 = %.1f%nValue2 = %.1f%nValue3 = %.1f%nValue4 = %.1f%n",
                value1, value2,value3, value4);

        System.out.printf("Average of value1 and Value2 is %.1f%n", average(value1,value2, value3,value4));
        System.out.printf("Average of all values is %.1f",
                average(30.90,90.10));

    }
}
