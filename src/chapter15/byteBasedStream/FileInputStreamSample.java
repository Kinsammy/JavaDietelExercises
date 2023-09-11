package chapter15.byteBasedStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamSample {
    public static void main(String[] args) {
        byte[]  bytes = new byte[30];
        try{
            FileInputStream stream = new FileInputStream("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/test.txt");
            stream.read(bytes);
            for (byte b: bytes ){
                if (Character.isLetterOrDigit(b)||Character.isSpaceChar(b)){
                    System.out.print(Character.toString(b));
                }

            }
//            System.out.println(Arrays.toString(bytes));
            stream.close();
        } catch (IOException ex){
            System.out.println(ex.getMessage());

        }


    }
}
