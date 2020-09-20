package th.ac.mahidol.itcs473;

public class Rational implements Comparable {
    long numerator, denominator;

    Rational() {
        // to be completed
        this.numerator = 0;
        this.denominator = 1;
    }

    Rational(long numerator, long denominator) {
        // to be completed
        if(denominator == 0) throw new IllegalArgumentException("Denominator should not be 0");
        this.numerator = numerator;
        this.denominator = denominator;
    } 

    // find the reduce form 
    private void simplestForm() { 
        long computeGCD; 
        computeGCD = GCD(Math.abs(numerator), denominator); 
        numerator /= computeGCD; 
        denominator /= computeGCD; 
    } 

    // find the greatest common denominator 
    private long GCD(long a, long b) { 
        if (a%b == 0) return b;
        else return GCD(b,a%b); 
    } 

    public void add(Rational x) { 
        this.numerator = (this.numerator * x.denominator) + (x.numerator * this.denominator);
        this.denominator = (this.denominator * x.denominator);
        simplestForm(); 
    }

    public void subtract(Rational x) {
        this.numerator = (this.numerator * x.denominator) - (x.numerator * this.denominator);
        this.denominator = (this.denominator * x.denominator);
        simplestForm();
    }

    public void multiply(Rational x) {
        this.numerator = this.numerator * x.numerator;
        this.denominator = this.denominator * x.denominator;
        simplestForm();
    }

    public void divide(Rational x) {
        this.numerator = this.numerator * x.denominator;
        this.denominator = this.denominator * x.numerator;
        simplestForm();
    }

    @Override
    public boolean equals(Object obj) {
        Rational r = (Rational) obj;

        r.simplestForm();
        this.simplestForm();

        if(r.numerator == this.numerator && r.denominator == this.denominator) return true;
        return false;
    }

    @Override
    public int compareTo(Object obj) {
        Rational r = (Rational) obj;

        r.simplestForm();
        this.simplestForm();

        long a = this.numerator*r.denominator, b = this.denominator*r.numerator;
        if(a > b) return 1;
        if(a < b) return -1;
        return 0;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        System.out.println("This is Rational class.");
    }
}