package th.ac.mahidol.itcs473;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import static org.junit.Assert.*;

public class TestConstructor {
    @Test
    public void shouldThrowErrorOnInvalidDenominator() {
        final long numerator = 1, denominator = 0;
        Exception exception = assertThrows(RuntimeException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                new Rational(numerator, denominator);
            }
        });

        String expectedMessage = "Denominator should not be 0";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldInstantiateCorrectValueIfArgumentIsValid() {
        long numerator = 1, denominator = 1;
        Rational r = new Rational(numerator, denominator);

        assertNotNull(r);
        assertEquals(numerator, r.numerator);
        assertEquals(denominator, r.denominator);
    }
}
