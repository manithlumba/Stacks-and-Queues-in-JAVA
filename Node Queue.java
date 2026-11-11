class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int val) {
        data = val;
        next = null;
    }
}

public class NodeQueue {
    private QueueNode front;
    private QueueNode rear;

    public NodeQueue() {
        front = null;
        rear = null;
    }

    public void push(int val) {
        QueueNode newNode = new QueueNode(val);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued: " + val);
    }

    public int pop() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -999;
        }
        int val = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return val;
    }

    public void display() {
        QueueNode temp = front;
        System.out.print("Linked Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}