package moshJava;

public class ArrayOperations {
    private int[] items;
    private int counter;


    public ArrayOperations(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == counter){
            int[] newItems =new int[counter * 2];
            for (int count = 0; count < counter; count++){
                newItems[count] = items[count];
            }
            items = newItems;

        }
        items[counter++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= counter) {
            throw new RuntimeException();
        }

        for (int count = index; count < counter; count++){
            items[count] = items[count + 1];
        }
        counter--;
    }

    public int indexOf(int item){
        for (int index = 0; index < counter; index++){
            if (items[index] == item){
                return index;
            }
        }
        return -1;
    }

    public void print(){
        for (int count = 0; count < counter; count++){
            System.out.println(items[count]);
        }
    }
}
