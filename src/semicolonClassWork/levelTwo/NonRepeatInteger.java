package semicolonClassWork.levelTwo;

public class NonRepeatInteger {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};
        System.out.println(findFirstUnique(arr));
    }

    private static int findFirstUnique(int[] numbers){
        int[] frequency = new int[100001];

        for (int i = 0; i<numbers.length; i++){
            frequency[i]++;
        }
        for (int i = 0; i < numbers.length; i++){
            if (frequency[i] == 1){
                return numbers[i];
            }
        }
        return -1;
    }
}
