package net.douzemille.javaplayground.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex2Test {
    @Test
    public void getDirectories() throws Exception {
        Path dirPath = Files.createTempDirectory("ex2");
        File dir1 = Files.createDirectory(Paths.get(dirPath.toString(), "dir1")).toFile();
        File dir2 = Files.createDirectory(Paths.get(dirPath.toString(), "dir2")).toFile();
        File file1 = Files.createFile(Paths.get(dirPath.toString(), "file1")).toFile();
        File file2 = Files.createFile(Paths.get(dirPath.toString(), "file2")).toFile();
        File file3 = Files.createFile(Paths.get(dirPath.toString(), "file3")).toFile();
        String[] results = Ex2.getDirectories(dirPath.toString());

        assertArrayEquals(new String[]{"dir1", "dir2"}, results);
    }

    @Test
    public void getDirectoriesWithEmptyDir() throws Exception {
        Path dirPath = Files.createTempDirectory("ex2");
        String[] results = Ex2.getDirectories(dirPath.toString());

        assertArrayEquals(new String[]{}, results);
    }

    @Test
    public void getDirectoriesWithNotExistingDir() throws Exception {
        String[] results = Ex2.getDirectories("/tmo/no-such-directory");

        assertArrayEquals(new String[]{}, results);
    }
}
