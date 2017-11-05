package net.douzemille.javaplayground.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex6Test {

    class TestingException extends Exception {
        TestingException(String msg) {
            super(msg);
        }
    };

    @Test
    public void uncheck() throws Exception {
        assertThrows(RuntimeException.class, () -> {
            Ex6.uncheck(() -> {
                throw new TestingException("error happened");
            }).run();
        });
    }
}
