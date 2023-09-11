package kunaDataStructureAlgorithm.binarySearch;

public class CeilingCharacter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';
        char ceilChar = ceilingCharacter(letters, target);
        System.out.println(ceilChar);
    }

    private static char ceilingCharacter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return letters[start  % letters.length];
    }
}
