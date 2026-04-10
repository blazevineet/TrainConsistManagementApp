import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSafeCargoAssignment() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");
        // Should execute without crashing
        assertDoesNotThrow(() -> bogie.assignCargo("Coal"));
    }

    @Test
    void testUnsafeCargoAssignmentHandling() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");
        // Because we caught it inside the method, it shouldn't throw to the test
        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }
}