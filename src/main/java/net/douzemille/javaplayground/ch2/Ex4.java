package net.douzemille.javaplayground.ch2;

import java.util.Arrays;

public class Ex4 {
    public static int[] intStream() {
        int[] ints = new int[]{1, 4, 9, 16};
        // Stream.of(ints) => Stream<int[]>
        return Arrays.stream(ints).map((e) -> e * e).toArray();
    }
}
