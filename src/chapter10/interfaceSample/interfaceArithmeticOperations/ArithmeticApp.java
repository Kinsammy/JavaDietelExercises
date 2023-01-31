package chapter10.interfaceSample.interfaceArithmeticOperations;

public class ArithmeticApp {
    public static void main(String[] args) {
        Arithmetics operations = new Arithmetics();
        System.out.printf("The sum of the two numbers is:: %d%n",operations.addition(20, 50));
        System.out.printf("The difference of the two numbers is:: %d%n", operations.subtract(20, 50));
        System.out.printf("The product of the two numbers is:: %d%n", operations.multiply(20, 50));
        System.out.printf("The division of the two numbers is:: %.2f%n", operations.division(120, 50));
        System.out.printf("The modulo of the two numbers is:: %d%n", operations.modulo(20, 50));
    }
}
