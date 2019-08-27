package com.kodilla.stream.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static Double getAverage(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        IntStream.range(0, numbers.length)
                .map(a -> a = list.get(a))
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .map(a -> a = list.get(a))
                .average()
                .getAsDouble();
//        Arrays.stream(numbers)
//                .forEach(System.out::println);
//
//        return Arrays.stream(numbers)
//                .average()
//                .orElse(Double.NaN);
    }
}
