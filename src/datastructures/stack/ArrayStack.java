package datastructures.stack;

/**
 * A stack is a data structure that follows the Last In First Out (LIFO) principle.
 *
 * Allows access to only one item, the last item inserted.
 * Items can be inserted and popped in O(1) time. Does not depend on the size of the stack. No comparisons or moves are needed.
 *
 * Most microprocessors have a stack in their architecture. Even some old pocket calculators used stack-based architecture.
 */
public class ArrayStack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        top++;
        stackArray[top] = value;
    }

    public int pop() {
        return stackArray[top--]; // return top item and decrement top
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
