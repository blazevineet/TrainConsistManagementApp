import java.util.*;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }
}

public class Main {
    public static void main(String[] args) {
        List<Bogie> train = new ArrayList<>();
        train.add(new Bogie("Sleeper", 72));
        train.add(new Bogie("AC Chair", 78));
        train.add(new Bogie("First Class", 24));
        train.add(new Bogie("General", 90));

        // UC10: Aggregate seating capacities using map and reduce
        int totalCapacity = train.stream()
                .map(Bogie::getCapacity)        // Step 1: Extract capacities
                .reduce(0, Integer::sum);      // Step 2: Sum them up starting from 0

        System.out.println("Total Train Seating Capacity: " + totalCapacity);
    }

    // Helper method for testing
    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
    }
}