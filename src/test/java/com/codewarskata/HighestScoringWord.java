package com.codewarskata;

public class HighestScoringWord {
    public static String high(String s) {
        String[] words = s.split(" ");
        int max = 0;
        String maxWord = "";
        for (String word : words) {
            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                sum += word.charAt(i);
            }
            if (sum > max) {
                max = sum;
                maxWord = word;
            }
        }
        return maxWord;
    }
}
