public class CircularQueue {
    private int[] cq;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueue(int cap) {
        capacity = cap;
        cq = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void push(int item) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        cq[rear] = item;
        System.out.println("Inserted: " + item);
    }

    public int pop() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -999;
        }
        int val = cq[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return val;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Circular Queue: ");
        int i = front;
        while (true) {
            System.out.print(cq[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}