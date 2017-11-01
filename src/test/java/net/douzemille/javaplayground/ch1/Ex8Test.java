package net.douzemille.javaplayground.ch1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Ex8Test {
    @Test
    public void capturing() {
        assertThat(
            Ex8.capturing(new String[]{"Peter", "Paul", "Mary"}),
            is(Arrays.asList("Peter", "Paul", "Mary"))
        );
    }
}
