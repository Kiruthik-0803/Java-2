import java.util.*;

class MyStack {
    private int[] arr;
    private int topIndex;
    private final int MAX_SIZE;

    public MyStack(int maxSize) {
        this.arr = new int[maxSize];
        this.MAX_SIZE = maxSize;
        this.topIndex = -1;
    }

    public boolean isFull() {
        return topIndex + 1 == MAX_SIZE;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public void push(int val) throws FullException {
        if (isFull()) throw new FullException();
        arr[++topIndex] = val;
    }

    public int pop() throws EmptyException {
        if (isEmpty()) throw new EmptyException();
        int result = arr[topIndex--];
        return result;
    }

    public int peek() throws EmptyException {
        if (isEmpty()) throw new EmptyException();
        return arr[topIndex];
    }
}

class FullException extends RuntimeException {}
class EmptyException extends RuntimeException {}

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        
        try {
            myStack.push(3); // Throws FullException
        } catch (FullException e) {
            System.err.println("Failed to add due to stack being full.");
        }
    }
}