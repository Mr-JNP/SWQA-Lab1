package th.ac.mahidol.itcs473;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestToString {

    @Test
    public void shouldPrintCorrectValue(){
        long numerator = 1, denominator = 3;
        Rational r = new Rational(numerator, denominator);
        String actualMessage = r.toString();
        assertTrue(actualMessage.contains(numerator + "/" + denominator));
    }
}
