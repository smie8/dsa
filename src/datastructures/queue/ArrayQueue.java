package datastructures.queue;

/**
 * ArrayQueue is a simple implementation of a queue using an array.
 *
 * This queue implementation uses a wrap-around technique to handle the circular nature of the queue.
 * Items can be inserted and removed from queue in O(1) time.
 *
 * This implementation could be made more efficient by removing the size variable.
 *
 * Note that dequeue is a double-ended queue, which means that items can be added or removed from both ends,
 * with methods like insertLeft() and insertRight() for adding items to the left or right end of the queue.
 * Dequeue is rarely used in practice, but it is a useful data structure to know about.
 */
public class ArrayQueue {

    private int maxSize;
    private int[] array;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void insert(int value) { // enqueue = put item at rear of queue
        if (rear == maxSize - 1) {
            rear = -1; // handle wraparound
        }

        array[++rear] = value; // increment rear and insert value
        size++;
    }

    public int remove() {
        int temp = array[front++]; // get value and increment front
        if (front == maxSize) {
            front = 0; // handle wraparound
        }

        size--;
        return temp;
    }

    public int peek() {
        return array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public int size() {
        return size;
    }
}
