package chapter15.byteBasedStream;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class DataOutputStreamSample {
    public static void main(String[] args) {
        /* 
        System.SetIn();
        System.SetOut();
        System.SetErr();
         */
        byte[] bytes = "Hello, Sammy!".getBytes();
        try (PrintStream altOut = new PrintStream("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/test3.txt")){
            System.setOut(altOut);
            try (var dos = new DataOutputStream(System.out)) {
                dos.write(bytes);
                dos.write(bytes);
            }   catch (IOException exception){
                System.err.println(exception.getMessage());
            }
        }   catch (IOException exception){
            System.err.println(exception.getMessage());
        }

    }
}
