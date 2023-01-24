package gamesFolder.tortiseAndHare;

import java.security.SecureRandom;

public class Race {
    private final int[] tortoiseLane = new int[70];
    private final int[] hareLane = new int[70];
    private  int tortoisePosition = 1;
    private int harePosition = 1;
    SecureRandom random = new SecureRandom();


    public void tortoiseMove(int move){
        move = 1 + random.nextInt(10);
        if (move <= 5){
            tortoisePosition += 3;
        } else {
            tortoisePosition = 1;
        }

        if (move >= 6 && move <= 7){
            tortoisePosition -=6;
        } else {
            tortoisePosition = 1;
        }

        if (move >= 8 && move <= 10){
            tortoisePosition += 1;
        }
    }

    public void hareMove(int move){
        move = 1 + random.nextInt(10);
        if (move >= 6 && move <=7){
            int option = random.nextInt(3);
            switch (option){
                case 0 -> harePosition = 0;
                case 1 -> harePosition += 9;
                case 2 -> harePosition -= 2;
            }
        }

        if (move >= 8 && move <= 10){
            harePosition += 1;
        }

        if (move <= 9){
            harePosition -= 12;
        }
    }

    public void setTortoiseLane(){
        for (int index = 0; index < tortoiseLane.length; index++){
            System.out.println("_");
        }
    }

    public void setHareLane(){
        for (int index = 0; index < hareLane.length; index++){
            System.out.println("_");
        }
    }


}
