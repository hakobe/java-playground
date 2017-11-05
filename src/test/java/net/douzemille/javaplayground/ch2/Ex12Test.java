package net.douzemille.javaplayground.ch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ex12Test {
    @Test
    public void countShortWords() {
        int[] results = Ex12.countShortWords(new String[]{"hi", "hello", "ho", "oops", "internationalization"});
        assertArrayEquals(
                results,
                new int[]{0,0,2,0,1,1,0,0,0,0,0,0}
        );
    }
}
