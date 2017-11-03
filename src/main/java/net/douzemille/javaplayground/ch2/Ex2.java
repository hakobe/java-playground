package net.douzemille.javaplayground.ch2;

import java.util.stream.Stream;

public class Ex2 {
    public static String[] collect(String[] strings) {
        return Stream.of(strings).filter((e) -> {
            System.out.println("Checking " + e);
            return e.length() > 3;
        }).limit(2).toArray(String[]::new);
    }
}
