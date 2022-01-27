package com.techreturnerskata.romannumerals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsKataTests {

    private static RomanNumeralsKata romanNumeral;

    @BeforeAll
    static void prepareRomanNumerals() {
        romanNumeral = new RomanNumeralsKata();
    }

    @Test
    void converts0() {
        Assertions.assertEquals("", romanNumeral.convertToRomanNumber(0));
    }

    @Test
    void converts1() {
        Assertions.assertEquals("I", romanNumeral.convertToRomanNumber(1));
    }

    @Test
    void converts2() {
        Assertions.assertEquals("II", romanNumeral.convertToRomanNumber(2));
    }

    @Test
    void converts4() {
        Assertions.assertEquals("IV", romanNumeral.convertToRomanNumber(4));
    }


    @Test
    void converts5() {
        Assertions.assertEquals("V", romanNumeral.convertToRomanNumber(5));
    }

    @Test
    void converts9() {
        Assertions.assertEquals("IX", romanNumeral.convertToRomanNumber(9));
    }


    @Test
    void converts10() {
        Assertions.assertEquals("X", romanNumeral.convertToRomanNumber(10));
    }


    @Test
    void converts12() {
        Assertions.assertEquals("XII", romanNumeral.convertToRomanNumber(12));
    }


    @Test
    void converts15() {
        Assertions.assertEquals("XV", romanNumeral.convertToRomanNumber(15));
    }

    @Test
    void converts20() {
        Assertions.assertEquals("XX", romanNumeral.convertToRomanNumber(20));
    }

    @Test
    void converts40() {
        Assertions.assertEquals("XL", romanNumeral.convertToRomanNumber(40));
    }

    @Test
    void convert50() {
        Assertions.assertEquals("L", romanNumeral.convertToRomanNumber(50));
    }

    @Test
    void convert90() {
        Assertions.assertEquals("XC", romanNumeral.convertToRomanNumber(90));
    }

    @Test
    void convert100() {
        Assertions.assertEquals("C", romanNumeral.convertToRomanNumber(100));
    }

    @Test
    void convert369() {
        Assertions.assertEquals("CCCLXIX", romanNumeral.convertToRomanNumber(369));
    }

    @Test
    void convert400() {
        Assertions.assertEquals("CD", romanNumeral.convertToRomanNumber(400));
    }

    @Test
    void convert500() {
        Assertions.assertEquals("D", romanNumeral.convertToRomanNumber(500));
    }
    @Test
    void convert900() {
        Assertions.assertEquals("CM", romanNumeral.convertToRomanNumber(900));
    }


    @Test
    void convert1000() {
        Assertions.assertEquals("M", romanNumeral.convertToRomanNumber(1000));
    }

    @Test
    void convert2000() {
        Assertions.assertEquals("MM", romanNumeral.convertToRomanNumber(2000));
    }
}




