package chapter15.byteBasedStream;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class DataInputStreamSample {
    public static void main(String[] args) {
        byte[] bytes = new byte[40];
        try(var stream = new DataInputStream(System.in)){
            int numberOfByte = stream.read(bytes);
            System.out.println("Number of Bytes::" + numberOfByte);
            for (byte b : bytes){
                if (b != 0 ){
                    System.out.print(Character.toString(b));
                }
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
