package net.douzemille.javaplayground.ch1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex8Test {
    @Test
    public void capturing() {
        assertEquals(
            Ex8.capturing(new String[]{"Peter", "Paul", "Mary"}),
            Arrays.asList("Peter", "Paul", "Mary")
        );
    }
}
