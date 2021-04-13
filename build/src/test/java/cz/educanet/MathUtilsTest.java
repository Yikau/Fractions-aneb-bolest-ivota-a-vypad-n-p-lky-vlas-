package cz.educanet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void findGreatestCommonDenominator() {
        assertEquals(4, MathUtils.findGreatestCommonDenominator(8, 12));
        assertEquals(5, MathUtils.findGreatestCommonDenominator(10, 5));
        assertEquals(5, MathUtils.findGreatestCommonDenominator(20, 5));
        assertEquals(1, MathUtils.findGreatestCommonDenominator(21, 5));

        assertNotEquals(5, MathUtils.findGreatestCommonDenominator(21, 5));
        assertNotEquals(4, MathUtils.findGreatestCommonDenominator(10, 5));
    }

    @Test
    void findLowestCommonMultiple() {
        assertEquals(60, MathUtils.findLowestCommonMultiple(12, 15));
        assertEquals(4, MathUtils.findLowestCommonMultiple(2, 4));
        assertEquals(50, MathUtils.findLowestCommonMultiple(10, 25));

        assertNotEquals(60, MathUtils.findLowestCommonMultiple(10, 25));
        assertNotEquals(60, MathUtils.findLowestCommonMultiple(2, 4));
    }
}