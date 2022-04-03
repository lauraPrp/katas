package com.codewarskata;

import java.util.List;
import java.util.stream.Stream;

public class HighestScoringWord {
    static final String[] alphabet = {"", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static List<String> split(String str) {
        return Stream.of(str.split(" "))
                .toList();
    }

    public static int getSingleScore(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 1; j < alphabet.length; j++) {
                if (String.valueOf(word.charAt(i)).equalsIgnoreCase(alphabet[j]))
                    score = score + j;
            }
        }
        return score;
    }

    public static String high(String s) {
        List<String> wordsList = split(s);
        String higherScore = "";
        for (String word : wordsList) {
            if (getSingleScore(higherScore) < getSingleScore(word))
                higherScore = word;
        }

        return higherScore;
    }

}