import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testBubbleSortLogic() {
        int[] unsorted = {90, 10, 50, 20};
        int[] expected = {10, 20, 50, 90};

        Main.bubbleSort(unsorted);

        assertArrayEquals(expected, unsorted, "The array was not sorted correctly by the algorithm.");
    }

    @Test
    void testAlreadySortedArray() {
        int[] sorted = {10, 20, 30};
        int[] expected = {10, 20, 30};

        Main.bubbleSort(sorted);
        assertArrayEquals(expected, sorted);
    }
}