package net.douzemille.javaplayground.ch2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Ex4Test {
    @Test
    public void intStream() {
        assertThat(Ex4.intStream(), is(new int[]{1, 16, 81, 256}));
    }
}
