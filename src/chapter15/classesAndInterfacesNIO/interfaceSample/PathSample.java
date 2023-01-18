package chapter15.classesAndInterfacesNIO.interfaceSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PathSample {
    public static void main(String[] args) {
        Path path = Paths.get("/home/samuel/IdeaProjects/JavaDietelExercises/src/gamesFolder");
//        ath path = Paths.get("/home/samuel/IdeaProjects/JavaDietelExercises/src/gamesFolder/classesAndInterface.txt");
        System.out.println("is directory:: " +Files.isDirectory(path));
        System.out.println("The File system:: "+ path.getFileSystem());

        // Check to see if path points to a hidden resource

        try {
            System.out.println(Files.isHidden(path));
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        // Check to see if path points to resource that path = Paths.get("/home/samuel/IdeaProjects/JavaDietelExercises/src/gamesFolder/classesAndInterface.txt"); exist
        System.out.println("exists? " + Files.exists(path));
    }
}
