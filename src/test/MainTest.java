import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSafetyCompliancePass() {
        List<GoodsBogie> safeTrain = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal")
        );
        assertTrue(Main.checkSafetyCompliance(safeTrain), "Train should be compliant.");
    }

    @Test
    void testSafetyComplianceFail() {
        List<GoodsBogie> unsafeTrain = Arrays.asList(
                new GoodsBogie("Cylindrical", "Chemicals"), // Violation!
                new GoodsBogie("Box", "Coal")
        );
        assertFalse(Main.checkSafetyCompliance(unsafeTrain), "Train should fail safety check due to Cylindrical-Chemical combo.");
    }
}