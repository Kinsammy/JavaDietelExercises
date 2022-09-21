package classWork;

public class AddNumbersOverloading {

    public int addNumbers(int number1, int number2){
        return number1 + number2;
    }


    public int addNumbers(int number1, double number2){
        return (int) (number1 + number2);
    }
    public double addNumbers(double number1, double number2){
        return number1 + number2;
    }

    public int addNumbers(double number1, int number2){
        return (int) (number1 + number2);
    }




}
