public class MyStack {
//    private boolean isEmpty = true;
    private int[] elements = new int[3];
    private int size = 0;
    public boolean isEmpty() {
        return size==0;
    }

    public void push(int element) {
        this.elements[size++] = element;
    }

    public int pop() {
        if (isEmpty()) throw new Underflow();
        return elements[--size];
    }


}


