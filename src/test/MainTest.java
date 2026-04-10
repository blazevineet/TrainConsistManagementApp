import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testTrainIDValidation() {
        assertTrue(Main.validateTrainID("TRN-5566"), "Valid Train ID should pass");
        assertFalse(Main.validateTrainID("TRN-123"), "Too short Train ID should fail");
        assertFalse(Main.validateTrainID("TRAIN-1234"), "Incorrect prefix should fail");
        assertFalse(Main.validateTrainID("TRN-ABCD"), "Letters instead of digits should fail");
    }

    @Test
    void testCargoCodeValidation() {
        assertTrue(Main.validateCargoCode("PET-AB"), "Valid Cargo Code should pass");
        assertFalse(Main.validateCargoCode("PET-abc"), "Lowercase letters should fail");
        assertFalse(Main.validateCargoCode("PET-12"), "Digits in Cargo Code should fail");
        assertFalse(Main.validateCargoCode("PET-ABC"), "Too many letters should fail");
    }
}