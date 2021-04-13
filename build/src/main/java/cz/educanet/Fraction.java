package cz.educanet;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction other) {
        int boringCalcs = MathUtils.findLowestCommonMultiple(denominator, other.denominator);
        int nevim = boringCalcs /denominator;
        int zasNevim = boringCalcs / other.denominator;
        int faktNevim = numerator * nevim;
        int aleUzNevimFakt = other.numerator * zasNevim;
        int hura = faktNevim  + aleUzNevimFakt;
        return new Fraction(hura, boringCalcs);
    }


        public Fraction minus(Fraction other){
        int boringCalcs = MathUtils.findLowestCommonMultiple(denominator, other.denominator);
        int nevim = boringCalcs /denominator;
        int zasNevim = boringCalcs / other.denominator;
        int faktNevim = numerator * nevim;
        int aleUzNevimFakt = other.numerator * zasNevim;
        int hura = faktNevim - aleUzNevimFakt;
        return new Fraction(hura, boringCalcs);
    }


    public Fraction times(Fraction other) {
        int Calcs1 = numerator * other.numerator;
        int Calcs2 = denominator * other.denominator;
        return new Fraction(Calcs1, Calcs2);
    }

    public Fraction dividedBy(Fraction other) {
       int CalcsZas1 = numerator * other.denominator;
       int CalcsZas2 = denominator * other.numerator;
       return new Fraction(CalcsZas1, CalcsZas2);
    }

    public Fraction getReciprocal() {
        return new Fraction(denominator, numerator);
    }

    public Fraction simplify() {
        int zasNevim = MathUtils.findGreatestCommonDenominator(getNumerator(), getDenominator());
        return new Fraction(getNumerator()/zasNevim, getDenominator()/zasNevim);
    }

    public float toFloat() {
        return (float) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
