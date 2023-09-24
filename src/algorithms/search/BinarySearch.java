package algorithms.search;

public class BinarySearch {

    // Begins with a sorted array of elements
    public static int binarySearch(int arr[], int target) {

        // Set initial pointers, start and end
        int left = arr[0];
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == target) {
                return middle; // Target found from the middle
            }

            if (target < arr[middle]) {
                right = middle - 1; // Target is smaller than the middle value, so adjust the right pointer
            } else {
                left = middle + 1; // Target is greater than the middle value, so adjust the left pointer
            }
        }

        // Target not found
        return -1;
    }
}
