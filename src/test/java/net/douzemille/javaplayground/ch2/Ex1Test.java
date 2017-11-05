package net.douzemille.javaplayground.ch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex1Test {
    @Test
    public void counter() {
        assertEquals(
            Ex1.count(new String[]{
                "hi", "hello", "goodbye", "ten", "cow"
            }),
            2
        );
    }
}
