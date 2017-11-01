package net.douzemille.javaplayground.ch1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Ex6Test {

    class TestingException extends Exception {
        TestingException(String msg) {
            super(msg);
        }
    };

    @Test(expected = RuntimeException.class)
    public void uncheck() throws Exception {
        Ex6.uncheck(() -> {
            throw new TestingException("error happened");
        }).run();
    }
}
