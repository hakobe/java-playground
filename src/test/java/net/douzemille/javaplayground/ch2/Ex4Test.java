package net.douzemille.javaplayground.ch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ex4Test {
    @Test
    public void intStream() {
        assertArrayEquals(Ex4.intStream(), new int[]{1, 16, 81, 256});
    }
}
