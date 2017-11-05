package net.douzemille.javaplayground.ch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ex6Test {
    @Test
    public void characterStram() {
        assertArrayEquals(
            Ex6.characterStrem("hello").toArray(Character[]::new),
            new Character[]{'h', 'e', 'l', 'l', 'o'}
        );
    }
}
