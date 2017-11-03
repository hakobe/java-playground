package net.douzemille.javaplayground.ch2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Ex2Test {
    @Test
    public void collect() {
        assertThat(
            Ex2.collect(
                new String[]{"hi", "hello", "goodbye", "interesting", "cow", "everything", "gone"}
            ),
            is(new String[]{"hello", "goodbye"})
        );
    }
}

