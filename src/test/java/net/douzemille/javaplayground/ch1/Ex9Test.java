package net.douzemille.javaplayground.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

        assertEquals(results, Arrays.asList(2,4));
    }
}
