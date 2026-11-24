package SCA_Lecture_Example.StackExample1;

public class Stack {
    private int[] arr;
    private int tos;
    private int size;

    public Stack(int size) {
        arr = new int[size];
        this.size = size;
        tos = -1;
    }

    //push the element
    public void push(int x) {
        if (tos == size - 1) {
            System.out.println("Stack OverFlow !");
            return;
        }
        tos++;
        arr[tos] = x;
    }

    //pop the element
    public int pop() {
        if (tos == -1) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int x = arr[tos];
        tos--;
        return x;
    }

    //pop the element
    public int peek() {
        if (tos == -1) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return arr[tos];
    }
}
