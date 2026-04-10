import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testGroupingByName() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 72),
                new Bogie("General", 90)
        );

        Map<String, List<Bogie>> result = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Verify that there are 2 groups
        assertEquals(2, result.size());

        // Verify Sleeper group has 2 entries
        assertEquals(2, result.get("Sleeper").size());

        // Verify General group has 1 entry
        assertEquals(1, result.get("General").size());
    }
}