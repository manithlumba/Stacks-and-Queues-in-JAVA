public class StackUsingTwoQueues {
    private Queue q1 = new Queue(10);
    private Queue q2 = new Queue(10);

    public void push(int x) {
        q1.push(x);
    }

    public int pop() {
        return q1.pop();
    }
}