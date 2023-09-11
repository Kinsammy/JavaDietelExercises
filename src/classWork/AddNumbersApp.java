package classWork;

public class AddNumbersApp {
    public static void main(String[] args) {
        AddNumbersOverloading overloading = new AddNumbersOverloading();

        System.out.printf("The total is %d%n",overloading.addNumbers(8,10));
        System.out.printf("The total is %d%n",overloading.addNumbers(10,80.5));
        System.out.printf("The total is %.2f%n",overloading.addNumbers(50.0, 50.0));
        System.out.printf("The total is %d%n",overloading.addNumbers(40.5, 45));
    }
}
