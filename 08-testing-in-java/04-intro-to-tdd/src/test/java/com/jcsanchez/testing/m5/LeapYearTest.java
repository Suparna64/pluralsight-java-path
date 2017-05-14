package com.jcsanchez.testing.m5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by jsssn on 13-May-17.
 */
public class LeapYearTest {

    @Test
    public void leapYearsAreDivisibleByFour() {
        assertTrue(LeapYear.isLeapYear(2016));
    }

    @Test
    public void normalYearsAreNotDivisibleByFour() {
        assertFalse(LeapYear.isLeapYear(3));
    }

    @Test
    public void leapYearsAreNotDivisibleByOneHundred() {
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    public void leapYearsAreDivisibleByFourHundred() {
        assertTrue(LeapYear.isLeapYear(2000));
    }
}
