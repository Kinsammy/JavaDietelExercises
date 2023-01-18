package chapter15.characterBasedStream;


import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFromFile {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(BufferedReaderFromFile.class);
        try(BufferedReader bufferedReader =
                    new BufferedReader( new FileReader("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/characterBasedStream/BufferedRead.txt"))) {

            System.out.println(bufferedReader.readLine());
        }catch (IOException exception){
            System.err.println("Exception message:: " + exception.getMessage());
            logger.error(()-> exception.getMessage());
        }
    }
}
