package com.techreturnerskata.bowling;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BowlingKataTest {

    @Test
    public void testfirstFrame() {
        BowlingKata bowling1 = new BowlingKata();
        int pinsAvailable=10;
        int prescore = bowling1.randomNumberSmallerthan10(pinsAvailable);
        assertTrue(prescore<=pinsAvailable);
        pinsAvailable =prescore;
        prescore = bowling1.randomNumberSmallerthan10(pinsAvailable);
        assertTrue(prescore<=pinsAvailable);

    }
}
