package datastructures.array;

/**
 * OrderedArray is a simple implementation of an ordered array. It uses a linear search to insert elements in the
 * correct order.
 * <p>
 * Here the array is always fixed size, so we need to be careful not to exceed the size.
 */
public class OrderedArray {

    private final int[] array;
    private int size;

    public OrderedArray(int max) {
        this.array = new int[max];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    /**
     * Uses binary search to return the index of the value in the array, or -1 if not found.
     */
    public int find(int value) {
        int lowerBound = 0;
        int upperBound = size - 1;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;

            if (array[mid] == value) {
                return mid; // found
            } else if (array[mid] < value) {
                lowerBound = mid + 1; // search in the right half
            } else {
                upperBound = mid - 1; // search in the left half
            }
        }

        return -1; // not found
    }

    /**
     * Uses linear search to insert the value
     */
    public void insert(int value) {
        if (size == array.length) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }

        int i;
        for (i = 0; i < this.size; i++) {
            if (array[i] > value) {
                // found the correct index to insert
                break;
            }
        }

        for (int j = size; j > i; j--) {
            // move bigger ones up, starting from the end of the array
            array[j] = array[j - 1];
        }

        // insert the value to found index
        array[i] = value;

        size++;
    }

    /**
     * Uses find to remove the value and shift the rest of the array. Note that when
     */
    public boolean delete(int value) {
        int i = find(value);
        if (i == -1) {
            return false;
        }

        // move items down - note that the last item is not moved (it stays in the array but we decrease the size so it won't ever be used)
        for (int j = i; j < size - 1; j++) {
            array[j] = array[j + 1];
        }

        size--;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderedArray items (size: ").append(size).append("): ");
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);

            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
