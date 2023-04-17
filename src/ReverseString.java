import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] characters = {'s','e','m','i','c', 'o', 'l', 'o', 'n'};
        System.out.println("Input characters " + Arrays.toString(characters));

        reverseString(characters);

    }

    private static void reverseString(char[] characters) {
        int start = 0;
        int end = characters.length-1;
       while(start < end){
           char temp = characters[start];
           characters[start] = characters[end];
           characters[end] = temp;
           start ++;
           end --;
       }
       System.out.println("The reversed characters are" + Arrays.toString(characters));
    }
}
