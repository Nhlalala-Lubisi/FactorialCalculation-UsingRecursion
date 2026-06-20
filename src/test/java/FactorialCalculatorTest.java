import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Factorial Calculator, covering edge cases and standard inputs.
 */
public class FactorialCalculatorTest {
    // 0! = 1 by mathematical definition (edge case)
    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }
    // 1! = 1 (base case)
    @Test
    void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }
    // 5! = 120 (standard case)
    @Test
    void testFactorialOfFive() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }
    // 10! = 3,628,800 (larger standard case)
    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, FactorialCalculator.factorial(10));
    }
    // Negative input must throw IllegalArgumentException (edge case)
    @Test
    void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-3));
    }
}
