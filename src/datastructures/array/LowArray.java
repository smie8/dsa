package datastructures.array;

/**
 * Very straightforward implementation of a fixed-size array using object-oriented principles.
 */
public class LowArray {

    private int[] array;

    public LowArray(int max) {
        this.array = new int[max];
    }

    public void setElement(int index, int value) {
        array[index] = value;
    }

    public int getElement(int index) {
        return array[index];
    }
}
