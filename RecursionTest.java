import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void fibonacci() {
        assertEquals(0, Recursion.fibonacci(0));
        assertEquals(1, Recursion.fibonacci(1));
        assertEquals(1, Recursion.fibonacci(2));
        assertEquals(55, Recursion.fibonacci(10));
    }

    @Test
    void power() {
        assertEquals(1, Recursion.power(5, 0));
        assertEquals(8, Recursion.power(2, 3));
        assertEquals(1, Recursion.power(3, 0));
        assertEquals(1024, Recursion.power(2, 10));
    }

    @Test
    void reverseString() {
        assertEquals("cba", Recursion.reverseString("abc"));
        assertEquals("madam", Recursion.reverseString("madam"));
        assertEquals("", Recursion.reverseString(""));
    }

    @Test
    void palindrome() {
        assertTrue(Recursion.palindrome("radar"));
        assertTrue(Recursion.palindrome("level"));
        assertFalse(Recursion.palindrome("hello"));
    }

    @Test
    void countDown() {
        // Since countDown prints to console, we can't directly assert.
        // Manual verification is needed by observing the console output.
        Recursion.countDown(5);
    }

    @Test
    void binarySearch() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(4, Recursion.binarySearch(array, 5, 0, array.length - 1));
        assertEquals(-1, Recursion.binarySearch(array, 10, 0, array.length - 1));
    }

    // Add similar tests for other methods

    // Example test for Merge Sort (Assuming array is sorted after sorting)
    @Test
    void mergeSort() {
        int[] array = {5, 2, 8, 1, 6, 3};
        Recursion.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 8}, array);
    }
}
