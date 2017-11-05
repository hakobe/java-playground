package net.douzemille.javaplayground.ch2;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex10Test {
    @Test
    public void average() {
        Stream<Double> st = Stream.of(1.0,2.0,3.0,4.0,5.0,6.0);
        assertEquals((double)Ex10.average(st), 3.5);
    }
}
