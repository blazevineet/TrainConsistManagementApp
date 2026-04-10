import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testTotalCapacityReduction() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 78),
                new Bogie("First Class", 24)
        );

        // Expected sum: 72 + 78 + 24 = 174
        int total = Main.calculateTotalCapacity(bogies);
        assertEquals(174, total, "The total capacity calculation is incorrect.");
    }

    @Test
    void testEmptyListCapacity() {
        List<Bogie> emptyTrain = new ArrayList<>();
        int total = Main.calculateTotalCapacity(emptyTrain);
        assertEquals(0, total, "Empty train should have 0 capacity.");
    }
}