package net.douzemille.javaplayground.ch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ex2Test {
    @Test
    public void collect() {
        assertArrayEquals(
            Ex2.collect(
                new String[]{"hi", "hello", "goodbye", "interesting", "cow", "everything", "gone"}
            ),
            new String[]{"hello", "goodbye"}
        );
    }
}

