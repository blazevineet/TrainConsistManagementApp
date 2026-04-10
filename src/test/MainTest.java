import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testBinarySearchFound() {
        String[] data = {"A", "B", "C", "D", "E"};
        assertEquals(0, Main.binarySearch(data, "A"), "Should find 'A' at start");
        assertEquals(4, Main.binarySearch(data, "E"), "Should find 'E' at end");
        assertEquals(2, Main.binarySearch(data, "C"), "Should find 'C' in middle");
    }

    @Test
    void testBinarySearchNotFound() {
        String[] data = {"A", "C", "E"};
        assertEquals(-1, Main.binarySearch(data, "B"), "Should return -1 for missing element");
    }
}