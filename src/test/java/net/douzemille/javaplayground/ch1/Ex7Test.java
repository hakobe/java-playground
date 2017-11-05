package net.douzemille.javaplayground.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex7Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void andThen() {
        System.setOut(new PrintStream(outContent));
        Ex7.andThen(() -> {System.out.print("1");}, () -> {System.out.print("2");}).run();
        System.setOut(null);

        assertEquals(outContent.toString(), "12");
    }
}
