package chapter5;

public class StarsPrintingShapes {
    public static void main(String[] args) {
        System.out.println("Square Shape");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("Left Shape");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Reverse Left Shape");
        for (int i = 1; i <= 5; i++){
            for (int j = i; j <= 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Right Shape");
        for (int i = 1; i <= 5; i++){
            for (int j = i; j <= 5; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Reverse Right Shape");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hill Pattern");
        for (int i = 1; i <= 5; i++){
            for (int j = i; j <= 5; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for (int k = 2; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Reverse Hill Pattern");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++){
                System.out.print("* ");
            }
            for (int k = i; k <= 4; k++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
