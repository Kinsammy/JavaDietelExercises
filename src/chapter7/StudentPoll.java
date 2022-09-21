package chapter7;

public class StudentPoll {
    public static void main(String[] args) {

        int[] reposnses =
                {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];


        for (int answer = 0; answer < reposnses.length; answer++){
            try {
                ++frequency[reposnses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("     response[%d] = %d%n%n",
                        answer, reposnses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for (int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}
