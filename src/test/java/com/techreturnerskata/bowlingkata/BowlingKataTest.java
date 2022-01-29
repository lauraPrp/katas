package com.techreturnerskata.bowlingkata;

import com.techreturnerskata.bowling.BowlingKata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingKataTest {
    private BowlingKata bowlingGame;

    @BeforeEach
    void setUp() {
        bowlingGame = new BowlingKata();
    }

    @Test
    public void testNoPinKnockedInGame() {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testAllOnes() {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(1);
        }
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void testOneSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);

        bowlingGame.roll(7);
        bowlingGame.roll(0);

        for (int i = 0; i < 16; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(24, bowlingGame.score());
    }

    @Test
    public void testOneStrikeAndNoOtherScore() {
        bowlingGame.roll(10);

        bowlingGame.roll(4);
        bowlingGame.roll(3);

        for (int i = 0; i < 18; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(24, bowlingGame.score());
    }

    @Test
    public void test3StrikesFollowedBySeven() {
        bowlingGame.roll(10);

        bowlingGame.roll(10);

        bowlingGame.roll(10);

        bowlingGame.roll(7);
        bowlingGame.roll(0);

        for (int i = 0; i < 12; i++) {
            bowlingGame.roll(0);
        }

        assertEquals(81, bowlingGame.score());
    }

    @Test
    public void test3StrikesThenNull() {
        bowlingGame.roll(10);

        bowlingGame.roll(10);

        bowlingGame.roll(10);

        for (int i = 0; i < 14; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(60, bowlingGame.score());
    }

    @Test
    public void testPerfectGame() {
        for (int i = 0; i < 12; i++) {
            bowlingGame.roll(10);
        }
        assertEquals(300, bowlingGame.score());
    }

    @Test
    public void testTenPairsOfNineThenMiss() {
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(9);
        }
        assertEquals(90, bowlingGame.score());
    }

    @Test
    public void testTenPairsOfFiveAndSparePlusFive() {
        //5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(5);
            bowlingGame.roll(5);
        }

        bowlingGame.roll(5);
        bowlingGame.roll(5);
        assertEquals(150, bowlingGame.score());
    }

    @Test
    public void testOneStrikeOneSpare() {
        bowlingGame.roll(10);

        bowlingGame.roll(6);
        bowlingGame.roll(4);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        for (int i = 0; i < 14; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(40, bowlingGame.score());
    }

    @Test
    public void testStrikeFollowedByStrike() {
        bowlingGame.roll(10);

        bowlingGame.roll(10);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        for (int i = 0; i < 14; i++) {
            bowlingGame.roll(0);
        }

        assertEquals(47, bowlingGame.score());
    }

    @Test
    public void testSpareFollowedBySpare() {
        bowlingGame.roll(6);
        bowlingGame.roll(4);

        bowlingGame.roll(5);
        bowlingGame.roll(5);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        for (int i = 0; i < 14; i++) {
            bowlingGame.roll(0);
        }

        assertEquals(35, bowlingGame.score());
    }

    @Test
    public void testSpareAndStrike() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);

        bowlingGame.roll(10);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        for (int i = 0; i < 14; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(44, bowlingGame.score());
    }

    @Test
    public void testLastTurnNoSpareNorStrike() {
        for (int i = 0; i < 18; i++) {
            bowlingGame.roll(0);
        }
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        assertEquals(7, bowlingGame.score());
    }

    @Test
    public void testLastTurnSpare() {
        for (int i = 0; i < 18; i++) {
            bowlingGame.roll(0);
        }

        bowlingGame.roll(6);
        bowlingGame.roll(4);
        bowlingGame.roll(7);
        assertEquals(17, bowlingGame.score());
    }

    @Test
    public void testLastTurnStrike() {
        for (int i = 0; i < 18; i++) {
            bowlingGame.roll(0);
        }

        bowlingGame.roll(10);

        bowlingGame.roll(3);
        bowlingGame.roll(4);
        assertEquals(17, bowlingGame.score());
    }

    @Test
    public void testLastFrameStrikeAndSpare() {
        for (int i = 0; i < 18; i++) {
            bowlingGame.roll(0);
        }

        bowlingGame.roll(10);

        bowlingGame.roll(5);
        bowlingGame.roll(5);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void testLastFrameSpareFollowedByStrike() {
        for (int i = 0; i < 18; i++) {
            bowlingGame.roll(0);
        }
        bowlingGame.roll(5);
        bowlingGame.roll(5);

        bowlingGame.roll(10);
        assertEquals(20, bowlingGame.score());
    }

}
