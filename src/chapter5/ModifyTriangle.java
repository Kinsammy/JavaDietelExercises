package chapter5;

public class ModifyTriangle {
    public static void main(String[] args) {
        for (int track = 1; track <= 4; track++) {
            for (int counter = 1; counter <= 10; counter++) {
                for (int count = 1; count <= counter; count++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            for (int counter = 1; counter <= 10; counter++){
                for (int count = 10; count >= counter; count--){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            for (int counter = 0; counter < 10; counter++){
                for (int count = 1; count < counter+1; count++){
                    System.out.print(" ");
                }
                for (int star = 10; star > counter; star--){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            for(int counter = 0; counter < 10; counter++) {
                for(int space = 10; space > counter; space--) {
                    System.out.print(" ");
                }
                for(int star = 1; star < counter+1; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
