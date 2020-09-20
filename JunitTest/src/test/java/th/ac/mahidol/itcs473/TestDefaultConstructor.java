package th.ac.mahidol.itcs473;

import org.junit.Test;

import static org.junit.Assert.*;

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

