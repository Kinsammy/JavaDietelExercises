package testingClasses;

public class ArrayUtils {
    public static int[] reverseMethod(int[] userArray) {
        int[] reverseArray = new int[userArray.length];
        int backwardCounter = userArray.length -1;
        int forwardCounter = 0;
        while (backwardCounter != -1){
            reverseArray[forwardCounter++] = userArray[backwardCounter--];
        }
        return reverseArray;
    }

    public static String reverseMethod(String userSting){
        String reverseString = "";
        int backwardCounter = userSting.length() -1;
        while (backwardCounter != -1){
            reverseString = reverseString + userSting.charAt(backwardCounter --);
        }
        return reverseString;
    }

    public static String capitalizeLetter(String userinput) {
        String firstLetter = (""+userinput.charAt(0)).toUpperCase();
        String otherLetters = "";
        for (int count = 1; count < userinput.length(); count++){
            otherLetters += userinput.charAt(count);
        }
        return firstLetter + otherLetters.toLowerCase();
    }
}
