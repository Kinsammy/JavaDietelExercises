package chapter15.classesAndInterfacesNIO.interfaceSample;

// todo This Code give you access to your all the folders in your System and was done in Linux OS.
// todo For Window OS copy the directory

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamSample {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("file.separator")+"home", "Documents");
        System.out.println(path);
        try(DirectoryStream<Path> directoryStream =  Files.newDirectoryStream(path)) {
            directoryStream.forEach(content -> System.out.println(content.getFileName()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
