import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class TestDefaultConstructor {

    @Test
    public void shouldInstantiateRational() {
        Rational r = new Rational();
        assertNotNull(r);
    }

    @Test
    public void shouldInstantiateValidRational() {
        Rational r = new Rational();
        assertNotEquals(0 ,r.denominator);
    }
}

