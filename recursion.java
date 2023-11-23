public class Recursion {

    // a. Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // b. Power
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    // c. Reverse String
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    // d. Palindrome
    public static boolean palindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            return (str.charAt(0) == str.charAt(str.length() - 1)) &&
                    palindrome(str.substring(1, str.length() - 1));
        }
    }

    // e. Count Down
    public static void countDown(int n) {
        if (n > 0) {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    // f. Binary Search
    public static int binarySearch(int[] array, int target, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                return binarySearch(array, target, mid + 1, high);
            } else {
                return binarySearch(array, target, low, mid - 1);
            }
        }
        return -1; // Not found
    }

    // g. Maze Solver (Assuming maze is represented as a 2D array)
    // Additional code needed based on maze representation and rules

    // h. Merge Sort
    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        // Implementation of merge step in merge sort
    }

    // i. N-Queens or Sudoku Solver (Additional code needed based on the problem)

    // j. Reverse Linked List
    // Additional code needed based on linked list representation

    // k. Tree Traversal
    // Additional code needed based on tree representation and traversal rules

    public static void main(String[] args) {
        // You can test your methods here
    }
}
