package net.douzemille.javaplayground.ch2;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.stream.Stream;

public class Ex8Test {
    @Test
    public void zip() {
        assertThat(
            Ex8.zip(Stream.of(1,3,5), Stream.of(2,4,6)).toArray(Integer[]::new),
            is(new Integer[]{1,2,3,4,5,6})
        );
    }
}
