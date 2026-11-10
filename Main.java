
import java.util.Arrays;

public class Main {

    // Method to find the median of an array
    public static double findMedian(int[] arr) {

        // Create a copy and sort the array
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int n = sorted.length;

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // If array length is odd
        if (n % 2 != 0) {
            return sorted[n / 2];
        }

        // If array length is even
        else {
            return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 4, 5, 1};

        double median = findMedian(arr);

        System.out.println("Median = " + median);
    }
}
