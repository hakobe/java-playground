package net.douzemille.javaplayground.ch2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex9Test {

    private Stream<ArrayList<Integer>> newStream() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(4,5,6));

        return Stream.of(a1, a2);
    }

    @Test
    public void concats() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        assertEquals(Ex9.concat1(newStream()), expected);
        assertEquals(Ex9.concat2(newStream()), expected);
        assertEquals(Ex9.concat3(newStream()), expected);
    }
}
