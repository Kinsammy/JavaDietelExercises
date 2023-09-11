package chapter10.interfaceSample.interfaceArithmeticOperations;

import java.util.Scanner;

public class Arithmetics implements ArithmeticOperations{
    Scanner scanner = new Scanner(System.in);
    @Override
    public int addition(int first, int second) {
        return first + second;
    }

    @Override
    public int subtract(int first, int second) {
        return first - second;
    }

    @Override
    public int multiply(int first, int second) {
        return first * second;
    }

    @Override
    public double division(int first, int second) {
        return first / second;
    }

    @Override
    public int modulo(int first, int second) {
        return first % second;
    }
}
