class StackNode {
    int data;
    StackNode next;

    public StackNode(int val) {
        data = val;
        next = null;
    }
}

public class NodeStack {
    private StackNode top;

    public NodeStack() {
        top = null;
    }

    public void push(int val) {
        StackNode newNode = new StackNode(val);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + val);
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -999;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public void display() {
        StackNode temp = top;
        System.out.print("Linked Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}