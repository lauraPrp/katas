package com.codewarskata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DontGiveMeFiveKataTest {

    @Test
    public void shouldReturnFour(){
        assertEquals(4,DontGiveMeFiveKata.dontGiveMeFive(1,5));
    }

    @Test
    public void exampleTests() {
        assertEquals(8, DontGiveMeFiveKata.dontGiveMeFive(1,9));
        assertEquals(12, DontGiveMeFiveKata.dontGiveMeFive(4,17));
    }
}