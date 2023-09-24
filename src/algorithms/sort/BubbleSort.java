package algorithms.sort;

public class BubbleSort {

    public static int[] bubbleSort(int arr[]) {

        // i = number of elements sorted, so each iteration we can skip the last i elements
        for (int i = 0; i < arr.length - 1; i++) {
            // j = index of element to compare with the next element, always start from the first array item
            // and end at the last unsorted element
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }

        return arr;
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
