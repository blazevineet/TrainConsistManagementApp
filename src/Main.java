import java.util.regex.*;

public class Main {
    // Regex Patterns
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    public static void main(String[] args) {
        String testTrainID = "TRN-1234";
        String testCargoCode = "PET-XY";

        System.out.println("Train ID Validation: " + validateTrainID(testTrainID));
        System.out.println("Cargo Code Validation: " + validateCargoCode(testCargoCode));
    }

    public static boolean validateTrainID(String input) {
        Pattern pattern = Pattern.compile(TRAIN_ID_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean validateCargoCode(String input) {
        return Pattern.matches(CARGO_CODE_REGEX, input); // Shortcut method
    }
}