package com.techreturnerskata.bowlingkata;

import org.junit.jupiter.api.Test;
import com.techreturnerskata.bowling.BowlingKata;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
