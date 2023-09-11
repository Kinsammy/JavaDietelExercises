package chapter15.characterBasedStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerToCollectInput {
    public static void main(String[] args) {
      try(FileInputStream fileInputStream =
                  new FileInputStream("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/characterBasedStream/bufferedWriter.txt")){
          Scanner scanner = new Scanner(fileInputStream);
          String input = scanner.nextLine();
          System.out.println("Program read:: " +input);
      }catch (IOException exception){
          System.out.println(exception.getMessage());
      }
    }
}
