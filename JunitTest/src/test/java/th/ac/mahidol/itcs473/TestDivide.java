package th.ac.mahidol.itcs473;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivide {
    @Test
    public void shouldDivideCorrectly(){
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 2);

        r1.divide(r2);
        assertEquals("1/1", r1.toString());
    }
}
