package chapter7;

public class AnalysisElementAndException {
    public static void main(String[] args) {

        int[] figures = {1, 3, 2, 5, 1, 8, 5, 6, 1, 7, 3, 4, 2, 1, 3, 5, 6, 7};
        int[] frequency = new int[7];
        for (int index = 0; index < figures.length; index++){
            try {
                ++frequency[figures[index]];
            }
            catch (ArrayIndexOutOfBoundsException element){
                System.out.println(element);
                System.out.printf("         Figure[%d] = %d%n%n", index, figures[index]);
            }

        }
        System.out.printf("%s%10s%n", "Index", "Outcome");
        for (int index = 1; index < frequency.length; index++){
            System.out.printf("%s%10d%n",index, frequency[index]);
        }

    }
}
