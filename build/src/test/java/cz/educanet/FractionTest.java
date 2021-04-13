package cz.educanet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private final Fraction fraction1 = new Fraction(1, 2);
    private final Fraction fraction2 = new Fraction(2, 4);
    private final Fraction fraction3 = new Fraction(1, 10);

    @Test
    void plus() {
        assertEquals(1, fraction1.plus(fraction1).toFloat());
        assertEquals(1, fraction2.plus(fraction1).toFloat());
        assertEquals(1, fraction1.plus(fraction2).toFloat());

        assertEquals(3f/5f, fraction3.plus(fraction2).toFloat());
        assertEquals(3f/5f, fraction1.plus(fraction3).toFloat());
        assertEquals(3f/5f, fraction3.plus(fraction1).toFloat());

        assertEquals(2/10f, fraction3.plus(fraction3).toFloat());
    }

    @Test
    void minus() {
        assertEquals(-2f/5, fraction3.minus(fraction2).toFloat());
        assertEquals(-2f/5, fraction3.minus(fraction1).toFloat());

        assertEquals(2f/5, fraction2.minus(fraction3).toFloat());
        assertEquals(2f/5, fraction1.minus(fraction3).toFloat());
    }

    @Test
    void times() {
        assertEquals(1f/20, fraction2.times(fraction3).toFloat());
        assertEquals(1f/20, fraction3.times(fraction2).toFloat());
        assertEquals(1f/20, fraction1.times(fraction3).toFloat());

        assertEquals(1f/100, fraction3.times(fraction3).toFloat());
    }

    @Test
    void dividedBy() {
        assertEquals(1, fraction3.dividedBy(fraction3).toFloat());
        assertEquals(1, fraction2.dividedBy(fraction2).toFloat());
        assertEquals(1, fraction1.dividedBy(fraction1).toFloat());

        assertEquals(1f/5, fraction3.dividedBy(fraction2).toFloat());
        assertEquals(1f/5, fraction3.dividedBy(fraction1).toFloat());
    }

    @Test
    void getReciprocal() {
        assertEquals(fraction3.getDenominator(), fraction3.getReciprocal().getNumerator());
        assertEquals(fraction3.getNumerator(), fraction3.getReciprocal().getDenominator());
        assertEquals(fraction2.getDenominator(), fraction2.getReciprocal().getNumerator());
        assertEquals(fraction2.getNumerator(), fraction2.getReciprocal().getDenominator());
        assertEquals(fraction1.getDenominator(), fraction1.getReciprocal().getNumerator());
    }

    @Test
    void simplify() {
        Fraction simpleFraction = fraction2.simplify();
        Fraction simpleFraction2 = fraction3.simplify();

        assertEquals(fraction1.getNumerator(), simpleFraction.getNumerator());
        assertEquals(fraction1.getDenominator(), simpleFraction.getDenominator());

        assertNotEquals(fraction1.getDenominator(), simpleFraction2.getDenominator());
    }
}