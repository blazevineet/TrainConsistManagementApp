import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSuccessfulSearch() {
        String[] data = {"TRN-1", "TRN-2", "TRN-3"};
        assertEquals(1, Main.linearSearch(data, "TRN-2"), "Should find ID at index 1");
    }

    @Test
    void testFailedSearch() {
        String[] data = {"TRN-1", "TRN-2"};
        assertEquals(-1, Main.linearSearch(data, "TRN-99"), "Should return -1 when ID is missing");
    }

    @Test
    void testCaseSensitivity() {
        String[] data = {"BOGIE"};
        // Linear search is usually case-sensitive unless specified
        assertEquals(-1, Main.linearSearch(data, "bogie"));
    }
}