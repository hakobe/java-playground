package net.douzemille.javaplayground.ch1;

public class Ex7 {
    public static Runnable andThen(Runnable first, Runnable second) {
        return () -> {
            first.run();
            second.run();
        };
    }
}
