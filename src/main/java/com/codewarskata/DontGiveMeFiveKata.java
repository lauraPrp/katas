package com.codewarskata;

import java.util.stream.IntStream;

public class DontGiveMeFiveKata {

    public static long dontGiveMeFive(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(x -> !String.valueOf(x)
                        .matches(".*5.*"))
                .count();
    }
}