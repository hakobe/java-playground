package net.douzemille.javaplayground.ch1;

import java.io.File;
import java.util.Arrays;

public class Ex3 {

    public static String[] getFilesWithExtenstion(String path, String ext) {
        File directory = new File(path);
        return directory.list((dir, name) -> name.endsWith(ext));
    }

}
