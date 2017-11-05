package net.douzemille.javaplayground.ch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.stream.Stream;

public class Ex8Test {
    @Test
    public void zip() {
        assertArrayEquals(
            Ex8.zip(Stream.of(1,3,5), Stream.of(2,4,6)).toArray(Integer[]::new),
            new Integer[]{1,2,3,4,5,6}
        );
    }
}
