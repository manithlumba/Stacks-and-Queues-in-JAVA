import java.util.Scanner;

public class Stack {
    private int[] st;
    private int top;
    private int capacity;

    public Stack(int cap) {
        capacity = cap;
        st = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        st[top] = val;
        System.out.println("Pushed: " + val);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -999;
        }
        int val = st[top];
        top--;
        return val;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(st[i] + " ");
        }
        System.out.println();
    }
}