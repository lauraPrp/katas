package com.codewarskata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BatmanQuotesTest {

    static String[] quotes = {"Quote Hidden in example test",
            "Holy haberdashery, Batman!",
            "Quote Hidden in example test"
    };


    @Test
    public void testShouldReturnHeroName() {
        assertEquals("Robin: ", BatmanQuotes.getName("Rob1n"));
    }

    @Test
    public void testShouldReturnANumber() {
        assertEquals(1, BatmanQuotes.getIndex("Rob1n"));
        assertEquals(0, BatmanQuotes.getIndex("J0ker"));
    }

    @Test
    public void testShouldReturnCorrectQuoteRobinOne() {
        assertEquals("Robin: Holy haberdashery, Batman!", BatmanQuotes.getQuote(quotes, "Rob1n"));
    }
}