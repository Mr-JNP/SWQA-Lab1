import org.junit.Test;

import static org.junit.Assert.*;

public class TestConstructor {
    @Test
    public void shouldThrowErrorOnInvalidDenominator() {
        long numerator = 1, denominator = 0;
        Exception exception = assertThrows(RuntimeException.class, () -> {
            new Rational(numerator, denominator);
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
