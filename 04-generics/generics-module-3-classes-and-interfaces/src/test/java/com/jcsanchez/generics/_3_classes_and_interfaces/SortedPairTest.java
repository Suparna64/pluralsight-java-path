package com.jcsanchez.generics._3_classes_and_interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class SortedPairTest {
    @Test
    public void shouldRetainOrderOfOrderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(1, 2);

        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());
    }

    @Test
    public void shouldFlipOrderOfMisorderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(2, 1);

        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());
    }
}