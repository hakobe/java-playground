package net.douzemille.javaplayground.ch2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Ex1Test {
    @Test
    public void counter() {
        assertThat(
            Ex1.count(new String[]{
                "hi", "hello", "goodbye", "ten", "cow"
            }),
            is(2)
        );
    }
}
