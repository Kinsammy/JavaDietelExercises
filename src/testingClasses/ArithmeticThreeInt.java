package testingClasses;

public class ArithmeticThreeInt {
    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public int product(int num1, int num2, int num3) {
        return  num1 * num2 * num3;
    }

    public int smallest(int num1, int num2, int num3) {
        int smallest;
        smallest = num1;
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;

        return smallest;
    }

    public int largest(int num1, int num2, int num3) {
        int largest = num1;
        if (num2 > largest)
            largest = num2;
        if (num3 > largest)
            largest = num3;
        return largest;
    }
}
