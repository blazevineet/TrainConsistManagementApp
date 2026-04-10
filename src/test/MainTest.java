import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testParityBetweenLoopAndStream() {
        List<Bogie> testData = Arrays.asList(
                new Bogie("A", 20), new Bogie("B", 80), new Bogie("C", 40)
        );

        // Filter: Capacity > 50
        List<Bogie> loopResult = new ArrayList<>();
        for(Bogie b : testData) if(b.getCapacity() > 50) loopResult.add(b);

        List<Bogie> streamResult = testData.stream()
                .filter(b -> b.getCapacity() > 50)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
        assertEquals(loopResult.get(0).getCapacity(), streamResult.get(0).getCapacity());
    }
}