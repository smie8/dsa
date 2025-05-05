package datastructures.queue;

/**
 * ArrayPriorityQueue is a simple implementation of a priority queue using an sorted array.
 *
 * Minimum values are at higher indexes (front of the queue is array[size - 1]).
 */
public class ArrayPriorityQueue {

    private int maxSize;
    private int[] array;
    private int size;

    public ArrayPriorityQueue(int maxSize) {
        this.array = new int[maxSize];
        this.maxSize = maxSize;
        this.size = 0;
    }

    public void insert(int value) {
        // insert to empty queue
        if (size == 0) {
            array[0] = value;
        } else {
            int i;
            // find correct spot to insert
            for (i = size - 1; i >= 0; i--) { // start at end
                if (value > array[i]) { // if new item is larger
                    array[i + 1] = array[i]; // move smaller item up
                } else {
                    break; // otherwise we found the spot
                }
            }

            // put new item into correct index
            array[i + 1] = value;
        }

        size++;
    }

    public int remove() {
        return array[--size];
    }

    public int peek() {
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void display() {
        System.out.println("Items in the queue:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nSize of the queue: " + size + "\n");
    }
}
