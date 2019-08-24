package com.kodilla.stream.array;

import java.util.*;

public interface ArrayOperations {
    public static Double getAverage(int[] numbers) {

        Arrays.stream(numbers)
                .forEach(System.out::println);

        return Arrays.stream(numbers)
                .average()
                .orElse(Double.NaN);
    }
}