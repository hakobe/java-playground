package net.douzemille.javaplayground.ch1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Ex3Test {
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void getFilesWithExtension() throws Exception {
        tempFolder.newFile("image1.jpg");
        tempFolder.newFile("image2.jpg");
        tempFolder.newFile("image3.png");
        String[] results = Ex3.getFilesWithExtenstion(tempFolder.getRoot().getPath(), "jpg");

        assertThat(Arrays.asList(results), hasItems("image1.jpg", "image2.jpg"));
    }

    @Test
    public void getFilesWithExtensionNotFound() throws Exception {
        tempFolder.newFile("image1.jpg");
        tempFolder.newFile("image2.jpg");
        tempFolder.newFile("image3.png");
        String[] results = Ex3.getFilesWithExtenstion(tempFolder.getRoot().getPath(), "gif");

        assertThat(results, equalTo(new String[]{}));
    }
}
