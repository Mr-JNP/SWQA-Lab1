import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCompareTo {
    @Test
    public void shouldReturnZeroIfEqual(){
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 2);

        assertEquals(0, r1.compareTo(r2));
    }

    @Test
    public void shouldReturnOneIfGreaterThan(){
        Rational r1 = new Rational(1, 1);
        Rational r2 = new Rational(1, 2);

        assertEquals(1, r1.compareTo(r2));
    }

    @Test
    public void shouldReturnOneIfLessThan(){
        Rational r1 = new Rational(1, 3);
        Rational r2 = new Rational(1, 2);

        assertEquals(-1, r1.compareTo(r2));
    }
}
