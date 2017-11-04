package net.douzemille.javaplayground.ch2;

import java.util.stream.Stream;


public class Ex5 {
    public static Stream<Long> randomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, (x) -> (a * x + c) % m).skip(1);
    }
}
