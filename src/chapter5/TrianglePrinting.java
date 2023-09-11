package chapter5;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int firstCounter = 1; firstCounter <= 10; firstCounter++){
            for (int firstCount = 1; firstCount <= firstCounter; firstCount++) {
//                System.out.printf("(%d, %d)%n", firstCounter,firstCount);
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------->");

        for (int firstCounter = 1; firstCounter <= 10; firstCounter++){
            for (int firstCount = 10; firstCount >= firstCounter; firstCount--) {
//                System.out.printf("(%d, %d)%n", firstCounter,firstCount);
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------->");

        for (int firstCounter = 0; firstCounter < 10; firstCounter++){
            for (int firstCount = 1; firstCount < firstCounter+1; firstCount++) {
                System.out.print(" ");
            }
            for (int firstStar = 10; firstStar > firstCounter; firstStar--){
//                System.out.printf("(%d, %d)%n", firstCounter,firstStar);
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------->");

        for (int firstCounter = 0; firstCounter < 10; firstCounter++){
            for (int firstCount = 10; firstCount > firstCounter; firstCount--) {
                System.out.print(" ");
            }
            for (int firstStar = 1; firstStar < firstCounter; firstStar++){
//                System.out.printf("(%d, %d)%n", firstCounter,firstStar);
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
