package net.douzemille.javaplayground.ch1;

import org.junit.Test;

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
