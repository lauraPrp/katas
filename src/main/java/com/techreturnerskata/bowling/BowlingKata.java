package com.techreturnerskata.bowling;

public class BowlingKata {
    private final int[] rolls = new int[22];
    private int currentRoll = 0;


    /*Each game has 10 turns of 2 rolls
     * score:
     * -strike :if all 10 pins are knocked down in a single roll, score is the sum of current and next turns
     * - spare: if all 10 pins are knocked in a single turn but 2 rolls, score is the sum of current turn + the very next roll
     * on last 10th turn:
     *if spare is achieved player gets an additional roll
     *if strike is achieved player gets 2 additional rolls
     * */


    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rollIndex)) {
                score += strikeScore(rollIndex);
                rollIndex++;
            } else if (isSpare(rollIndex)) {
                score += spareScore(rollIndex);
                rollIndex += 2;
            } else {
                score += normalScore(rollIndex);
                rollIndex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int rollIndex) {
        return rolls[rollIndex] == 10;
    }

    private boolean isSpare(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }

    private int normalScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1];
    }

    private int strikeScore(int rollIndex) {
        return normalScore(rollIndex) + rolls[rollIndex + 2];
    }

    private int spareScore(int rollIndex) {
        return normalScore(rollIndex) + rolls[rollIndex + 2];
    }
}
