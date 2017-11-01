package net.douzemille.javaplayground.ch1;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

public class Ex2 {
    public static String[] getDirectories(String path) {
        File fromDir = new File(path);
        return Optional.ofNullable(
            fromDir.listFiles(File::isDirectory)
        ). map(files ->
            Arrays.stream(files).map(File::getName).sorted().toArray(String[]::new)
        ).orElse(new String[]{});
    }
}
