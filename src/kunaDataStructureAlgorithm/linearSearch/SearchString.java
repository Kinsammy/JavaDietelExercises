package kunaDataStructureAlgorithm.linearSearch;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = "Fanu Samuel Ibukun".toLowerCase();
        char target = 'a';
        char[] letters = name.toCharArray();
        boolean isExist = search(name, target);
        boolean isExistTwo = searchTwo(name, target);
        System.out.println(Arrays.toString(letters));
        System.out.println("The character exist:: "+isExist);
        System.out.println("The index exist:: " +isExistTwo);
    }

    public static boolean search(String str, char target) {
        if (str.length() == 0){
            return false;
        }


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    public static boolean searchTwo(String str, char target){
        if (str.length() == 0){
            return false;
        }

        char[] letters = str.toCharArray();
        for (char ch: letters){
            if (ch == target){
                return true;
            }
        }

        return false;
    }
}
