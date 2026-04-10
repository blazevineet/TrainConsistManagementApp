import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSearchOnEmptyListThrowsException() {
        List<String> emptyList = new ArrayList<>();

        // Assert that the specific exception is thrown
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            Main.performSafeSearch(emptyList, "ANY-ID");
        });

        // Verify the message content
        assertTrue(exception.getMessage().contains("train consist is empty"));
    }

    @Test
    void testSearchOnPopulatedListSucceeds() {
        List<String> populatedList = Arrays.asList("B-001");

        // Should not throw any exception
        assertDoesNotThrow(() -> {
            Main.performSafeSearch(populatedList, "B-001");
        });
    }
}