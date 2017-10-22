package net.douzemille.javaplayground.ch1;

import java.io.File;
import java.util.Arrays;

public class Ex4 {
    public static File[] sortFiles(File[] files) {
        File[] sortedFiles = files.clone();
        Arrays.<File>sort(sortedFiles, (f1, f2) -> {
            if ( (f1.isFile() && f2.isFile()) || (f1.isDirectory() && f2.isDirectory()) ) {
                return f1.getName().compareTo(f2.getName());
            } else if (f1.isFile() && f2.isDirectory()) {
                return 1;
            } else if (f1.isDirectory() && f2.isFile()) {
                return -1;
            }
            return 0;
        });
        return sortedFiles;
    }
}
