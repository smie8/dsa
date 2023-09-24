import algorithms.recursion.Recursion;
import algorithms.search.BinarySearch;
import algorithms.sort.BubbleSort;
import algorithms.sort.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        testRecursion();
//        testBinarySearch();
        testBubbleSort();
        testInsertionSort();

        // TODO:
        // - implement selection sort
        // - implement merge sort
        // - implement quick sort

        // - implement linked list
        // - implement stack
        // - implement queue
        // - implement hash table
        // - implement heap
        // - implement graph
        // - implement trie
        // - implement binary search tree

        // - implement dynamic programming
        // - implement greedy algorithm
        // - implement backtracking

        // - implement dijkstra's algorithm
        // - implement a* algorithm
        // - implement breadth first search
        // - implement depth first search
    }

    public static void testRecursion() {
        System.out.println("6th fibonacci should be 8: " + Recursion.fibonacci(6));
        System.out.println("Factorial of 4 should be 24: " + Recursion.factorial(4));
        System.out.println("Sum of 1 to 3 should be 6: " + Recursion.sum(3));
        System.out.println("2 to the power of 3 should be 8: " + Recursion.power(2, 3));
        System.out.println("Reverse of 'hello' should be 'olleh': " + Recursion.reverseString("hello"));
        System.out.println("Number of occurrences of 'l' in 'hello' should be 2: " + Recursion.countOfOccurrences("hello", 'l'));
        System.out.println("Sum of even numbers from 1 to 4 should be 6: " + Recursion.sumOfEvenNumbers(4));
        System.out.println("Sum of even numbers from 1 to 6 should be 12: " + Recursion.sumOfEvenNumbers(6));
        System.out.println("Count of digits in 1234 should be 4: " + Recursion.countDigits(1234));
    }

    public static void testBinarySearch() {
        System.out.println("Binary search for 3 in [1, 2, 3, 4, 5] should be 2: " + BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println("Binary search for 5 in [1, 2, 3, 4, 5] should be 4: " + BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 5));
    }

    public static void testBubbleSort() {
        int[] arrayOfInts = {5, 4, 3, 2, 1};
        int[] arrayOfInts2 = {1, 2, 3, 4, 5};
        int[] arrayOfInts3 = {3, 4, 1, 9, 2, 5, 7, 8, 6};

        System.out.println("Bubble sort for [5, 4, 3, 2, 1]: " + Arrays.toString(BubbleSort.bubbleSort(arrayOfInts)));
        System.out.println("Bubble sort for [1, 2, 3, 4, 5]: " + Arrays.toString(BubbleSort.bubbleSort(arrayOfInts2)));
        System.out.println("Bubble sort for [3, 4, 1, 9, 2, 5, 7, 8, 6]: " + Arrays.toString(BubbleSort.bubbleSort(arrayOfInts3)));
    }

    public static void testInsertionSort() {
        int[] arrayOfInts = {5, 4, 3, 2, 1};
        int[] arrayOfInts2 = {1, 2, 3, 4, 5};
        int[] arrayOfInts3 = {3, 4, 1, 9, 2, 5, 7, 8, 6};

        System.out.println("Insertion sort for [5, 4, 3, 2, 1]: " + Arrays.toString(InsertionSort.insertionSort(arrayOfInts)));
        System.out.println("Insertion sort for [1, 2, 3, 4, 5]: " + Arrays.toString(InsertionSort.insertionSort(arrayOfInts2)));
        System.out.println("Insertion sort for [3, 4, 1, 9, 2, 5, 7, 8, 6]: " + Arrays.toString(InsertionSort.insertionSort(arrayOfInts3)));
    }
}
