package net.douzemille.javaplayground.ch1;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
    public static List<String> capturing(String[] names) {
        List<String> results = new ArrayList<>();
        List<Runnable> runners = new ArrayList<>();
        for (String name: names) {
            runners.add(() -> results.add(name));
        }

        for (Runnable runner: runners) {
            runner.run();
        }
        return results;
    }
}
