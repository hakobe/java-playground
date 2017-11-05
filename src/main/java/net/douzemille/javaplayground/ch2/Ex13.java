package net.douzemille.javaplayground.ch2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex13 {
    public static Map<Integer, Long> countShortWords(String[] strings) {
        return Stream.of(strings)
                .filter((s) -> s.length() < 12)
                .collect(Collectors.groupingBy(
                        String::length, Collectors.counting()));
    }
}
