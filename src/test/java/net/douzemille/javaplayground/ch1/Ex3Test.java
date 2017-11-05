package net.douzemille.javaplayground.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class Ex3Test {
    @Test
    public void getFilesWithExtension() throws Exception {
        Path dirPath = Files.createTempDirectory("ex3");
        Files.createFile(Paths.get(dirPath.toString(), "image1.jpg")).toFile();
        Files.createFile(Paths.get(dirPath.toString(), "image2.jpg")).toFile();
        Files.createFile(Paths.get(dirPath.toString(), "image3.png")).toFile();
        String[] results = Ex3.getFilesWithExtenstion(dirPath.toString(), "jpg");
        Arrays.sort(results);

        assertArrayEquals(results, new String[]{"image1.jpg", "image2.jpg"});
    }

    @Test
    public void getFilesWithExtensionNotFound() throws Exception {
        Path dirPath = Files.createTempDirectory("ex3");
        Files.createFile(Paths.get(dirPath.toString(), "image1.jpg")).toFile();
        Files.createFile(Paths.get(dirPath.toString(), "image2.jpg")).toFile();
        Files.createFile(Paths.get(dirPath.toString(), "image3.jpg")).toFile();
        String[] results = Ex3.getFilesWithExtenstion(dirPath.toString(), "gif");

        assertArrayEquals(results, new String[]{});
    }
}
