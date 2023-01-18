package chapter15.characterBasedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterSample {
    public static void main(String[] args) {
        try(BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/characterBasedStream/bufferedWriter.txt"))){
            bufferedWriter.write("Samuel F. is a Software Engineer");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
