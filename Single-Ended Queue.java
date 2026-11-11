public class Queue {
    private int[] q;
    private int front;
    private int rear;
    private int capacity;

    public Queue(int cap) {
        capacity = cap;
        q = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void push(int val) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        q[rear] = val;
        System.out.println("Inserted: " + val);
    }

    public int pop() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -999;
        }
        int val = q[front];
        front++;
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return val;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}