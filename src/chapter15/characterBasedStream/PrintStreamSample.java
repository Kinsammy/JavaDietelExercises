package chapter15.characterBasedStream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamSample {
    public static void main(String[] args) {
        try(PrintStream printStream = new PrintStream("output.txt")) {
            System.setOut(printStream);
            System.out.println("Java is Structure!!!");

        } catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
