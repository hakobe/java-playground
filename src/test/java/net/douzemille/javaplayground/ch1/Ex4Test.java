package net.douzemille.javaplayground.ch1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Ex4Test {
    @Test
    public void sortFiles() throws Exception {
        Path dirPath = Files.createTempDirectory("ex4");
        File dir1 = Files.createDirectory(Paths.get(dirPath.toString(), "dir1")).toFile();
        File dir2 = Files.createDirectory(Paths.get(dirPath.toString(), "dir2")).toFile();
        File file1 = Files.createFile(Paths.get(dirPath.toString(), "file1")).toFile();
        File file2 = Files.createFile(Paths.get(dirPath.toString(), "file2")).toFile();
        File file3 = Files.createFile(Paths.get(dirPath.toString(), "file3")).toFile();

        File[] sortedFiles = Ex4.sortFiles(new File[]{
                file3, file1, dir2, file2, dir1
        });

        assertArrayEquals(sortedFiles, new File[]{
                dir1, dir2, file1, file2, file3
        });
    }
}
