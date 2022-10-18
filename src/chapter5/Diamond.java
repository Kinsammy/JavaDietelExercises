package chapter5;

public class Diamond {
    public static void main(String[] args) {

        for (int counter = 1; counter <=10; counter++){
            for (int count = 10; count <= counter; counter++){
                for (int star = 1; star <= counter-1; star++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
