package chapter7;

public class Rating {
    public static void main(String[] args) {
        int[] numbers ={7, 8, 12, 4, 5, 6, 8};
        System.out.println(rating(numbers));

    }
    public static int rating(int[] numbers){
        int count = 0;
        int temp = 0;
        for (int number : numbers){
            if (number > 6){
                count++;
            }
            if (temp > count){
                temp = count;
            }
            if (number < 6){
                count = 0;
            }


        }
        return count;
    }
}
