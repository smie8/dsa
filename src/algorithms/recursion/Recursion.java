package algorithms.recursion;

public class Recursion {

    // Fibonacci is a sequence of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        // Recursive case: f(n-1) + f(n-2) + ... + f(1) + f(0)
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // Factorial is the product of an integer and all the integers below it.
    public static int factorial(int n) {
        // Base case: if n is 0 or 1
        if (n <= 1) {
            return n;
        }
        // Recursive case:
        return n * factorial(n-1);
    }

    // Sum of all numbers from 1 to n
    public static int sum(int n) {
        // Base case: if n is 0 or 1
        if (n <= 1) {
            return n;
        }
        // Recursive case:
        return n + sum(n-1);
    }

    // Raise a base number to non-negative integer exponent (power)
    public static int power(int base, int exponent) {
        // Base case: if exponent is 0
        if (exponent == 0) {
            return 1;
        }
        // Recursive case:
        return base * power(base, exponent - 1);
    }

    // Reverse a string
    public static String reverseString(String str) {
        // Base case: if string is empty or 1 letter
        if (str.length() <= 1) {
            return str;
        }
        // Recursive case: reverse the substring from index 1 to end, then add the first letter
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Count the number of occurrences of a character in a string
    public static int countOfOccurrences(String str, char targetChar) {
        if (str.length() == 0) {
            return 0;
        }

        // Recursive case: if the first letter is the target char, add 1 to the count
        if (str.charAt(0) == targetChar) {
            return 1 + countOfOccurrences(str.substring(1), targetChar);
        } else {
            return countOfOccurrences(str.substring(1), targetChar);
        }
    }

    // Count the sum of positive even numbers from 1 to n
    public static int sumOfEvenNumbers(int n) {
        if (n <= 1) {
            return 0;
        }

        // Recursive case:
        if (n % 2 == 0) {
            // If n is even, include it in the returned sum
            return n + sumOfEvenNumbers(n - 1);
        } else {
            return sumOfEvenNumbers(n - 1);
        }
    }

    // Count digits of a number
    public static int countDigits(int number) {
        // Base case:
        if (Integer.toString(number).length() == 1) {
            return 1;
        }

        // Recursive case:
        return 1 + countDigits(number / 10);
    }
}
