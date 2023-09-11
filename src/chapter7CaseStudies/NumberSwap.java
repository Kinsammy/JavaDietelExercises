package chapter7CaseStudies;

import java.security.SecureRandom;

public class NumberSwap {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int face1 = 0;
        int face2 = 0;
        int face3 = 0;
        int face4 = 0;
        int face5 = 0;
        int face6 = 0;
        for (int count = 1; count <= 7000; count++) {
            int numbers = 1 + randomNumber.nextInt(30);
            switch (numbers){
                case 1 -> face1++;
                case 2 -> face2++;
                case 3 -> face3++;
                case 4 -> face4++;
                case 5 -> face5++;
                case 6 -> face6++;
            }

        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n", face1, face2, face3, face4, face5, face6);
    }
}
