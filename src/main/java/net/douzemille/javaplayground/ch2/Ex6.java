package net.douzemille.javaplayground.ch2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex6 {
    public static Stream<Character> characterStrem(String s) {
        return IntStream.range(0, s.length()).mapToObj(s::charAt);
    }
}
