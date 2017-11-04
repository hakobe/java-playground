package net.douzemille.javaplayground.ch2;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class Ex10Test {
    @Test
    public void average() {
        Stream<Double> st = Stream.of(1.0,2.0,3.0,4.0,5.0,6.0);
        assertThat(Ex10.average(st), is(3.5));
    }
}
