package th.ac.mahidol.itcs473;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSubstract {
    @Test
    public void shouldSubtractCorrectly() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 2);

        r1.subtract(r2);
        assertEquals("0/1", r1.toString());
    }
}
