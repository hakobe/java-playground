package net.douzemille.javaplayground.ch1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.*;

public class Ex2Test {
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void getDirectories() throws Exception {
        tempFolder.newFile("testFile1");
        tempFolder.newFile("testFile2");
        tempFolder.newFolder("testDir1");
        tempFolder.newFolder("testDir2");
        tempFolder.newFolder("testDir3");
        String[] results = Ex2.getDirectories(tempFolder.getRoot().getPath());

        assertArrayEquals(new String[]{"testDir1", "testDir2", "testDir3"}, results);
    }

    @Test
    public void getDirectoriesWithEmptyDir() throws Exception {
        String[] results = Ex2.getDirectories(tempFolder.getRoot().getPath());

        assertArrayEquals(new String[]{}, results);
    }

    @Test
    public void getDirectoriesWithNotExistingDir() throws Exception {
        String[] results = Ex2.getDirectories("/tmo/no-such-directory");

        assertArrayEquals(new String[]{}, results);
    }
}
