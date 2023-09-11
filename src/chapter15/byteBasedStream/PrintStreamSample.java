package chapter15.byteBasedStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamSample {
    public static void main(String[] args) {
        try( PrintStream printStream =
                     new PrintStream("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/byteBasedStream/printStreamOutput.txt")){
            printStream.println("1. Semicolon African");
            printStream.println("2. Software Engineering");

        }catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }


    }
}
