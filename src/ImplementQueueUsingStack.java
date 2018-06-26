import java.util.Stack;

public class ImplementQueueUsingStack {

    /** Initialize your data structure here. */
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    public ImplementQueueUsingStack() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stackOut.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stackOut.isEmpty()){
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
