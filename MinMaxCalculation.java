import java.util.Arrays;

public class MinMaxCalculation {
    public static void main(String[] args) {
        // Sample array of numbers
        int[] numbers = {10, 5, 20, 15, 8};
        
        // Compute minimum and maximum using Java built-in methods
        int min = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
        int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        
        // Output the results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
