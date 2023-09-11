package chapter7;

public class PixelQuantization {
    public static void main(String[] args) {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 0};
        System.out.println("Pixel Quantization");
        for (int counter = 0; counter < pixel.length; counter++){
            if (counter == 9){
                System.out.printf("     %d", 190);
            }
            else {
                System.out.printf("%d-%d: %d%n ", counter * 20 + 1, counter * 20 + 20, pixel[counter]);
            }
        }
    }
}
