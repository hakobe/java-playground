package net.douzemille.javaplayground.ch2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex1 {
    public static int count(String[] strings) {
        AtomicInteger counter = new AtomicInteger(0);
        ArrayList<Thread> threads = new ArrayList<>();
        for (String str: strings) {
            Thread t = new Thread(() -> {
                if (str.length() > 3) {
                    counter.incrementAndGet();
                }
            });
            t.run();
            threads.add(t);
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return counter.get();
    }
}
