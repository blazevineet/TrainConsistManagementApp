public class Main {
    public static void main(String[] args) {
        // Unsorted list of Bogie IDs
        String[] bogieIDs = {"B-102", "B-505", "B-301", "B-999", "B-204"};
        String searchKey = "B-999";

        // UC18: Perform Linear Search
        int index = linearSearch(bogieIDs, searchKey);

        if (index != -1) {
            System.out.println("Bogie " + searchKey + " found at index: " + index);
        } else {
            System.out.println("Bogie " + searchKey + " not found in the train consist.");
        }
    }

    /**
     * Logic: Sequential Traversal
     * Complexity: O(n)
     */
    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            // Using .equals() for safe String comparison
            if (arr[i].equals(key)) {
                return i; // Early Termination: Match found
            }
        }
        return -1; // Match not found
    }
}