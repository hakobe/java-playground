package net.douzemille.javaplayground.ch1;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex9 {
    interface Collection2<E> extends Collection<E> {
        default void forEachIf(Consumer<E> action, Predicate<E> filter) {
            this.forEach((e) -> {
                if (filter.test(e)) {
                    action.accept(e);
                }
            });
        }
    }
}
