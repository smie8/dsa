package datastructures.arrays;

/**
 * Old-fashioned procedural programming example of an array application.
 */
public class ArrayApp {
  public static void main(String[] args) {
    // declare array and needed variables
    int[] array;
    array = new int[5];
    int size = 0;
    int searchKey;
    int i; // loop counter

    // insert 5 items
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;
    // update size
    size = 5;

    // display items
    System.out.println("Items in the array:");
    for (i = 0; i < size; i++) {
      System.out.print(array[i] + " ");
    }

    // find item with key 3
    for (i = 0; i < size; i++) {
      if (array[i] == 3) {
        System.out.println("\nFound item with key 3 at index: " + i);
        break;
      }
    }
    System.out.println("Removing item with key 3:");
    // move higher items down = remove the found item
    for (int j = i; j < size - 1; j++) {
      array[j] = array[j + 1];
    }
    // decrement size
    size--;

    // display items
    System.out.println("Items in the array after removing item with key 3:");
    for (i = 0; i < size; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
