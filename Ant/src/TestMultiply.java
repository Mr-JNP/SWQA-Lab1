import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultiply {

    @Test
    public void shouldMultiplyCorrectly(){
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 2);

        r1.multiply(r2);
        assertEquals("1/4", r1.toString());
    }
}
