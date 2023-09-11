package chapter15.byteBasedStream;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamSample {
    public static void main(String[] args) {

        try{
            FileOutputStream stream =
                    new FileOutputStream("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/test2.txt");
            stream.write("SammyTech".getBytes());
        } catch (IOException ex){

        }
    }
}
