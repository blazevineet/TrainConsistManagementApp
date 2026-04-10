import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testValidCapacity() {
        // Should not throw any exception
        assertDoesNotThrow(() -> {
            new PassengerBogie("Sleeper", 72);
        });
    }

    @Test
    void testInvalidCapacityThrowsException() {
        // Verify that the custom exception is actually thrown
        InvalidCapacityException exception = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("General", 0);
        });

        assertTrue(exception.getMessage().contains("Must be greater than 0"));
    }
}