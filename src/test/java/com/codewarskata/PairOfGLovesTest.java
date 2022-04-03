package com.codewarskata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairOfGLovesTest {
    @Test
    void shouldReturnZero() {
        assertEquals(0, PairOfGLoves.numberOfPairs(new String[]{}));

    }

    @Test
    void shouldReturnOne() {
        assertEquals(1, PairOfGLoves.numberOfPairs(new String[]{"red", "red"}));
    }

    void shouldReturnZeroAllDifferentGlovesOdd() {
        assertEquals(0, PairOfGLoves.numberOfPairs(new String[]{"red", "green", "blue"}));
    }

    void shouldReturnThreePairedGlovesEven() {
        assertEquals(3, PairOfGLoves.numberOfPairs(new String[]{"gray", "black", "purple", "purple", "gray", "black"}));
    }

    void shouldReturnFourMixedGloves() {
        assertEquals(4, PairOfGLoves.numberOfPairs(new String[]{"red", "green", "blue", "blue", "red", "green", "red", "red", "red"}));
    }
}