package net.douzemille.javaplayground.ch2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Ex12 {
    public static int[] countShortWords(String[] strings) {
        AtomicInteger[] results = new AtomicInteger[12];
        Arrays.setAll(results, v -> new AtomicInteger(0));
        Stream.of(strings).parallel().forEach((s) -> {
            if (s.length() < 12) {
                results[s.length()].incrementAndGet();
            }
        });
        return Stream.of(results).mapToInt(AtomicInteger::get).toArray();
    }
}
