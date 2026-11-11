public class QueueUsingTwoStacks {
    private Stack s1 = new Stack(10);
    private Stack s2 = new Stack(10);

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s1.pop() == -999 && s2.pop() == -999) {
            System.out.println("Queue is empty");
            return -999;
        }
        // If s2 is empty, transfer all elements from s1
        // (Assuming simple logic structure for class demonstration)
        return s1.pop();
    }
}