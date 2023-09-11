package kunaDataStructureAlgorithm;

public class Swap {
    public static void main(String[] args) {
        int first = 2;
        int second = 5;
        swap(first,second);


    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("first number:: %d\nsecond number::%d", a, b);
    }
}
