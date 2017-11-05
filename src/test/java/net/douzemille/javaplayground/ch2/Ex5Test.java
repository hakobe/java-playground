package net.douzemille.javaplayground.ch2;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ex5Test {
    @Test
    public void iterate() {
        Stream<Long> rs = Ex5.randomStream(25214903917L, 11L, Math.round(Math.pow(2, 48)), 932L);

        assertArrayEquals(
            rs.limit(3).toArray(Long[]::new),
            new Long[]{23500290450655L, -207458700899074L, 7389751442481L}
        );
    }
}
