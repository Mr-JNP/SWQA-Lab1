import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEquals {
    @Test
    public void shouldReturnTrueIfEqual(){
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 2);

        assertEquals(true, r1.equals(r2));
    }

    @Test
    public void shouldReturnFalseIfNotEqual(){
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);

        assertEquals(false, r1.equals(r2));
    }
}
