package chapter14;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "1. hello there";
        char[] chars = new char[5];

        for (int i = 0; i < s1.length(); i++){

            if (Character.isDigit(s1.charAt(i))){
                System.out.printf(" %s is digit", s1.charAt(i));
            } else if (Character.isSpaceChar(s1.charAt(i))) {
                System.out.printf(" %s is space", s1.charAt(i));
            }

            System.out.println(s1.trim().charAt(i));
        }

        for (int count  = s1.length() - 1; count >= 0; count--){
            System.out.println(" "+s1.charAt(count));
        }

        s1.getChars(0,5, chars, 0);
        for (char character : chars){
            System.out.println(character);
        }
    }
}
