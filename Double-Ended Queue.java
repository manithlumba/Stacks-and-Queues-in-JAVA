public class Deque {
    private int[] dq;
    private int front;
    private int rear;
    private int capacity;

    public Deque(int cap) {
        capacity = cap;
        dq = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void insertRear(int val) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Deque Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        dq[rear] = val;
        System.out.println("Inserted at rear: " + val);
    }

    public int deleteFront() {
        if (front == -1) {
            System.out.println("Deque Underflow");
            return -999;
        }
        int val = dq[front];
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
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(dq[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}