package chapter15.characterBasedStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileFormatter {
    public static void main(String[] args) {

        StringBuilder  builder = new StringBuilder();
        String patch = "Is located at 312 Herbert Macaulay way, Sabo, Yaba, Lagos";
        try (Formatter formatter =
                     new Formatter("file.txt")){
            Scanner scanner =
                    new Scanner(new FileInputStream("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/characterBasedStream/output.txt"));
            String str = scanner.nextLine();
            builder.append(str);
            formatter.format("files contents have been updated from %s to %s", str, builder.append(patch));
        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        }

    }
}
