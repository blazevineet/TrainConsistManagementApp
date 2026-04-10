import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String id;
    private int capacity;

    public Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    public int getCapacity() { return capacity; }
}

public class Main {
    public static void main(String[] args) {
        List<Bogie> dataset = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            dataset.add(new Bogie("B-" + i, (int) (Math.random() * 100)));
        }

        // --- Loop Performance ---
        long startLoop = System.nanoTime();
        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : dataset) {
            if (b.getCapacity() > 50) {
                filteredLoop.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopDuration = endLoop - startLoop;

        // --- Stream Performance ---
        long startStream = System.nanoTime();
        List<Bogie> filteredStream = dataset.stream()
                .filter(b -> b.getCapacity() > 50)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamDuration = endStream - startStream;

        // Display Results
        System.out.println("Execution Results:");
        System.out.println("Loop Duration   : " + loopDuration + " ns");
        System.out.println("Stream Duration : " + streamDuration + " ns");
        System.out.println("Difference      : " + Math.abs(streamDuration - loopDuration) + " ns");
    }
}