import java.util.*;

// Step 1: Create Bogie Class
class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display format
    @Override
    public String toString() {
        return name + " | Capacity: " + capacity;
    }
}

// Main Application Class
public class Main{

    public static void main(String[] args) {

        // Step 2: Create List to store bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 3: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 30));
        bogieList.add(new Bogie("Second Sitting", 90));

        // Step 4: Display before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 5: Sort using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 6: Display after sorting
        System.out.println("\nAfter Sorting (By Capacity - Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Optional: Descending order
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nAfter Sorting (By Capacity - Descending):");
        bogieList.forEach(System.out::println);
    }
}