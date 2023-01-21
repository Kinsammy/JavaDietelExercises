package chapter15.classesAndInterfacesNIO.classesSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSample {
    public static void main(String[] args) {
        Path path = Paths.get("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/classesAndInterfacesNIO/./classesSample");
        System.out.println(path.getFileSystem());
        System.out.println("isDirectory:: "+ Files.isDirectory(path));
        System.out.println("exists:: " +Files.exists(path));
        try {
            System.out.println("modified" +Files.getLastModifiedTime(path));
        } catch (IOException exception){
            System.err.println("error:: "+exception.getMessage());
        }

    }
}
