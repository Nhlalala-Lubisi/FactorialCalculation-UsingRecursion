/**
 * Factorial Calculator - Computes the factorial of a number using recursion.
 */
public class FactorialCalculator {

    public static long factorial(int n) {
        // Edge case: factorial is undefined for negative numbers
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers: " + n);
        }
        // Base case: 0! = 1 and 1! = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Test cases covering normal values, edge cases (0, 1), and a negative number
        int[] testCases = {0, 1, 5, 10, 12, -3};

        for (int n : testCases) {
            try {
                System.out.printf("factorial(%d) = %d%n", n, factorial(n));
            } catch (IllegalArgumentException e) {
                // Handle invalid input
                System.out.printf("factorial(%d) → Error: %s%n", n, e.getMessage());
            }
        }
    }
}
