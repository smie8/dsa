package algorithms.sort;

/**
 * Insertion sort is simple but inefficient for large data sets.
 * it takes each element from the input data and finds the location it belongs in the sorted list in a nested loop.
 *
 * Time complexity: O(n^2).
 * Space complexity: O(1).
 */
public class InsertionSort {

    public static int[] insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    // No need to continue checking the rest of the array since it's already sorted
                    break;
                }
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
