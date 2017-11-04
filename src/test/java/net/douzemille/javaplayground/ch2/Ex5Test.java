package net.douzemille.javaplayground.ch2;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import java.util.stream.Stream;

public class Ex5Test {
    @Test
    public void iterate() {
        Stream<Long> rs = Ex5.randomStream(25214903917L, 11L, Math.round(Math.pow(2, 48)), 932L);

        assertThat(
            rs.limit(3).toArray(Long[]::new),
            is(new Long[]{23500290450655L, -207458700899074L, 7389751442481L})
        );
    }
}
