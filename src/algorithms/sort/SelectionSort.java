package algorithms.sort;

/**
 * Selection sort is a simple and inefficient sorting algorithm, where the minimum element is selected
 * from the unsorted portion of the array (left side) and swapped with the first unsorted element.
 *
 * Time complexity: O(n^2).
 * Space complexity: O(1).
 */
public class SelectionSort {

  public static int[] selectionSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;

      // search through the unsorted portion of the array for the minimum element
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      // swap the minimum element with the first unsorted element
      swap(arr, i, minIndex);
    }

    return arr;
  }

  public static void swap(int[] array, int indexA, int indexB) {
    int temp = array[indexA];
    array[indexA] = array[indexB];
    array[indexB] = temp;
  }
}
