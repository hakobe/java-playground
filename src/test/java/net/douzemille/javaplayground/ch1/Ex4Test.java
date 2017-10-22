package net.douzemille.javaplayground.ch1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class Ex4Test {
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void sortFiles() throws Exception {
        File dir1 = tempFolder.newFolder("dir1");
        File dir2 = tempFolder.newFolder("dir2");
        File file1 = tempFolder.newFile("file1");
        File file2 = tempFolder.newFile("file2");
        File file3 = tempFolder.newFile("file3");

        File[] sortedFiles = Ex4.sortFiles(new File[]{
                file3, file1, dir2, file2, dir1
        });

        assertThat(sortedFiles, equalTo(new File[]{
                dir1, dir2, file1, file2, file3
        }));
    }

}
