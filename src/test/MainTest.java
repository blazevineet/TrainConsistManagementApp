import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testAlphabeticalSorting() {
        String[] input = {"General", "AC Chair", "Sleeper"};
        String[] expected = {"AC Chair", "General", "Sleeper"};

        Main.sortBogieNames(input);

        assertArrayEquals(expected, input, "The names should be sorted alphabetically.");
    }

    @Test
    void testCaseSensitivity() {
        // Java sorts Uppercase before Lowercase in natural order
        String[] input = {"sleeper", "AC Chair"};
        String[] expected = {"AC Chair", "sleeper"};

        Main.sortBogieNames(input);
        assertArrayEquals(expected, input);
    }
}