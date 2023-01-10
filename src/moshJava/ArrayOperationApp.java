package moshJava;

public class ArrayOperationApp {
    public static void main(String[] args) {
        ArrayOperations number = new ArrayOperations(3);
        number.insert(50);
        number.insert(56);
        number.insert(40);
        number.insert(90);
//        number.removeAt(3);
        System.out.println("The index is: " + number.indexOf(50));
        number.print();
    }
}
