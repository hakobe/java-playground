package net.douzemille.javaplayground.ch2;

import java.util.Iterator;
import java.util.stream.Stream;

public class Ex8 {
    // This is not my solution.
    // It's from https://github.com/DanielChesters/java-SE-8-Really-Impatient/blob/c2fb4b8899c1c416a20e2233d2a9b8bec57fa65a/src/main/java/org/danielchesters/javase8/Chapter2.java#L90-L102
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondItr = second.iterator();
        return first.flatMap((t) -> {
            if (secondItr.hasNext()) {
                return Stream.of(t, secondItr.next());
            } else {
                first.close();
                return null;
            }
        });
    }
}
