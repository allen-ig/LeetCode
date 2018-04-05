import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> myStack;
    Stack<Integer> minStack;

    public MinStack() {
        myStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        myStack.push(x);
        if (!minStack.isEmpty()){
            int min = minStack.peek();
            if (x <= min){
                minStack.push(x);
            }
        }else{
            minStack.push(x);
        }
    }
    
    public void pop() {
        int x = myStack.pop();
        if (!minStack.isEmpty()){
            if (x == minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top() {
        return myStack.peek();
    }

    public int getMin() {
        if (!minStack.isEmpty()) return minStack.peek();
        else return 0;
    }
}
