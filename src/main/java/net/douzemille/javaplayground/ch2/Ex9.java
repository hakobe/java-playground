package net.douzemille.javaplayground.ch2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Ex9 {
    public static <E> ArrayList<E> concat1(Stream<ArrayList<E>> st) {
        return st.reduce((a1, a2) -> {
                final ArrayList<E> ret = new ArrayList<>();
                ret.addAll(a1);
                ret.addAll(a2);
                return ret;
            }).orElseGet(ArrayList::new);
    }

    public static <E> ArrayList<E> concat2(Stream<ArrayList<E>> st) {
        return st.reduce(new ArrayList<>(), (res, as) -> {
                res.addAll(as);
                return res;
            });
    }

    public static <E> ArrayList<E> concat3(Stream<ArrayList<E>> st) {
        return st.reduce(new ArrayList<>(),
                (res, as) -> {
                    res.addAll(as);
                    return res;
                },
                (a1, a2) -> {
                    final ArrayList<E> ret = new ArrayList<>();
                    ret.addAll(a1);
                    ret.addAll(a2);
                    return ret;
                }
            );
    }
}
