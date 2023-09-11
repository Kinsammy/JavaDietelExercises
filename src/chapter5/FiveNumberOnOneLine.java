package chapter5;

public class FiveNumberOnOneLine {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 100){
            System.out.print(" "+ counter);
            if (counter % 20 == 0){
                System.out.println();
            }
            counter ++;
        }
    }
}
