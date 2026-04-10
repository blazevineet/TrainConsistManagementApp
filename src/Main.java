import java.util.*;

// 1. Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String name;
    private int capacity;

    // 2. Constructor with Validation (Fail-Fast)
    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity: " + capacity + ". Must be greater than 0.");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Valid Bogie
            PassengerBogie bogie1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + bogie1.getName());

            // Invalid Bogie - This will trigger the catch block
            PassengerBogie bogie2 = new PassengerBogie("First Class", -5);

        } catch (InvalidCapacityException e) {
            System.err.println("Safety Check Failed: " + e.getMessage());
        }
    }
}