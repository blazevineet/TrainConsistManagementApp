import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initial unsorted capacities
        int[] capacities = {72, 24, 90, 18, 54};

        System.out.println("Original Capacities: " + Arrays.toString(capacities));

        // UC16: Manual Bubble Sort
        bubbleSort(capacities);

        System.out.println("Sorted Capacities:   " + Arrays.toString(capacities));
    }

    /**
     * Logic: Repeatedly swap adjacent elements if they are in the wrong order.
     * Time Complexity: O(n²)
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap Logic using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}