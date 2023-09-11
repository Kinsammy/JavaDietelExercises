package dsaClass;

public class IsArrayInSortedOrder {
    public static void main(String[] args) {
        int[] lists = {1,3,5,2,7,6};
        System.out.println(isArrayInSortedOrder(lists, 5));
    }

    public static int isArrayInSortedOrder(int[] elements, int number){
        if (number == 1){
            return 1;
        }
        return (elements[number - 1] < elements[number - 2] ? 0: isArrayInSortedOrder(elements, number - 1));
    }
}
