import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    @Test
    void testPrime() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    void testNotPrime() {
        assertFalse(PrimeChecker.isPrime(8));
    }

    @Test
    void testLessThan2() {
        assertFalse(PrimeChecker.isPrime(1));
    }
    @Test
    void testEdgeCases() {
        assertFalse(PrimeChecker.isPrime(0)); // n < 2
        assertTrue(PrimeChecker.isPrime(2));  // không vào loop
        assertFalse(PrimeChecker.isPrime(9)); // chia hết trong loop
    }
}