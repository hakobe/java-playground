package net.douzemille.javaplayground.ch2;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class Ex6Test {
    @Test
    public void characterStram() {
        assertThat(
            Ex6.characterStrem("hello").toArray(Character[]::new),
            is(new Character[]{'h', 'e', 'l', 'l', 'o'})
        );
    }
}
