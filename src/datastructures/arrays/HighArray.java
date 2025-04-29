package datastructures.arrays;

/**
 * More high-level implementation of an array.
 *
 * Compare to LowArray: abstraction level is higher and the client doesn't have to think about the index numbers.
 * Set and get methods are replaced by insert(), find() and delete() methods.
 */
public class HighArray {

  private int[] array;
  private int size;

  public HighArray(int max) {
    array = new int[max]; // create array with maximum size
    size = 0; // initialize as empty
  }

  /**
   * Find key from the array.
   */
  public boolean find(int searchKey) {
    for (int i = 0; i < size; i++) {
      if (array[i] == searchKey) {
        return true; // found
      }
    }
    return false; // not found
  }

  /**
   * Insert value into the array.
   */
  public void insert(int value) {
    array[size] = value;
    size++;
  }

  public boolean delete(int value) {
    int i;
    // search for value
    for (i = 0; i < size; i++) {
      if (array[i] == value) {
        break; // found it
      }
    }

    // return false if not found
    if (i == size) {
      return false;
    }

    // move higher values down (overwriting the value to be deleted)
    for (int j = i; j < size; j++) {
      array[j] = array[j + 1];
    }

    size--;

    return true;
  }

  public void display() {
    for (int i = 0; i < size; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
