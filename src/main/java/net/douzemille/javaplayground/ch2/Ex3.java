package net.douzemille.javaplayground.ch2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class Ex3 {
    public static String[] randomStrings() {
        Random r = new Random();
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < 500; i++){
            int l = r.nextInt(15) + 1;
            results.add(String.join("", Collections.nCopies(l, "x")));
        }
        return results.toArray(new String[]{});
    }
    public static void countBenchmark() {
        String[] strings = randomStrings();

        long beforeS = System.nanoTime();
        Stream.of(strings).filter((e) -> e.length() > 12).count();
        long afterS = System.nanoTime();
        // System.out.println("Sequential\t" +  String.valueOf(afterS - beforeS));

        long beforeP = System.nanoTime();
        Stream.of(strings).parallel().filter((e) -> e.length() > 12).count();
        long afterP = System.nanoTime();
        // System.out.println("Parallel\t" + String.valueOf(afterP - beforeP));
    }
}
