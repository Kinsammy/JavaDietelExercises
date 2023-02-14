package leetCode;

public class ReverseNumber {
    public static void main(String[] args) {
        int numbers = 23579;
        int reverseNumber  = 0;
        while (numbers > 0){
            int rem = numbers % 10;
            numbers /= 10;
            reverseNumber = reverseNumber * 10 + rem;
        }
        System.out.println(reverseNumber);
    }
}
