package chapter7;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] b = new int[0];
        for (int count = 0; count < a.length; count++) {
            System.out.print(count);
            System.out.print(" ");
        }
        System.out.println();

        for (int index = 100; index >  b.length; index--) {
            System.out.print(index);
            System.out.print(" ");
        }
    }

}
