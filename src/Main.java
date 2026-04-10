import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> emptyTrain = new ArrayList<>();

        try {
            System.out.println("Initiating search on empty train...");
            performSafeSearch(emptyTrain, "B-101");
        } catch (IllegalStateException e) {
            System.err.println("Operation Aborted: " + e.getMessage());
        }
    }

    /**
     * Logic: State Validation before Execution
     * Throws: IllegalStateException if list is empty
     */
    public static void performSafeSearch(List<String> bogies, String key) {
        // UC20: Fail-Fast Validation
        if (bogies == null || bogies.isEmpty()) {
            throw new IllegalStateException("Search Failed: The train consist is empty. Please add bogies before searching.");
        }

        // Search logic only proceeds if the state is valid
        if (bogies.contains(key)) {
            System.out.println("Bogie " + key + " found!");
        } else {
            System.out.println("Bogie " + key + " not found.");
        }
    }
}