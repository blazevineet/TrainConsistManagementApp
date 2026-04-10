import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return "Capacity:" + capacity;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Bogie> train = new ArrayList<>();
        train.add(new Bogie("Sleeper", 72));
        train.add(new Bogie("Sleeper", 72));
        train.add(new Bogie("AC Chair", 78));
        train.add(new Bogie("AC Chair", 78));
        train.add(new Bogie("General", 90));

        // UC9: Grouping bogies by Name using Streams
        Map<String, List<Bogie>> groupedBogies = train.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Displaying the result
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " Bogies: " + list);
        });
    }
}