import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Precondition: Data MUST be sorted
        String[] bogieIDs = {"B-101", "B-205", "B-309", "B-412", "B-500", "B-670"};
        String searchKey = "B-412";

        System.out.println("Searching for: " + searchKey + " in sorted list " + Arrays.toString(bogieIDs));

        // UC19: Perform Binary Search
        int resultIndex = binarySearch(bogieIDs, searchKey);

        if (resultIndex != -1) {
            System.out.println("Success: Bogie found at index " + resultIndex);
        } else {
            System.out.println("Result: Bogie not found.");
        }
    }

    /**
     * Logic: Divide and Conquer
     * Complexity: O(log n)
     */
    public static int binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Better way to find mid to avoid overflow
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return mid; // Found it!
            } else if (comparison > 0) {
                low = mid + 1; // Key is in the upper half
            } else {
                high = mid - 1; // Key is in the lower half
            }
        }
        return -1; // Not found
    }
}