package chapter15.characterBasedStream;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterSample {
    public static void main(String[] args) {
        try(PrintWriter printWriter = new PrintWriter("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/characterBasedStream/printWriter.txt")){
            printWriter.print("I am joined Software Engineers");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
