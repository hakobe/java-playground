package net.douzemille.javaplayground.ch1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Ex9Test {
    class ArrayList2<E> extends ArrayList<E> implements Ex9.Collection2<E> {}

    @Test
    public void forEachIf() {
        ArrayList2<Integer> collection = new ArrayList2<>();
        Collections.addAll(collection, 1,2,3,4,5);

        ArrayList<Integer> results = new ArrayList<>();

        collection.forEachIf(
            (e) -> {
                results.add(e);
            },
            (e) -> {
                return e % 2 == 0;
            }
        );

        assertThat(results, is(Arrays.asList(2,4)));
    }
}
