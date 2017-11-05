package net.douzemille.javaplayground.ch2;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex13Test {
    @Test
    public void countShortWords() {
        Map<Integer, Long> results = Ex13.countShortWords(
                new String[]{"hi", "hello", "ho", "oops", "internationalization"}
        );

        assertEquals((long)results.get(2), 2);
        assertEquals((long)results.get(4), 1);
        assertEquals((long)results.get(5), 1);
    }
}
