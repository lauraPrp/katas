package com.codewarskata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PairOfGLoves {
    public static int numberOfPairs(String[] gloves) {

        return (int) Arrays.stream(gloves)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .mapToLong(pairs -> pairs.getValue() / 2)
                .sum();
    }
}
