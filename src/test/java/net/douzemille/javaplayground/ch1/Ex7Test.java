package net.douzemille.javaplayground.ch1;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Ex7Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void andThen() {
        System.setOut(new PrintStream(outContent));
        Ex7.andThen(() -> {System.out.print("1");}, () -> {System.out.print("2");}).run();
        System.setOut(null);

        assertThat(outContent.toString(), equalTo("12"));
    }
}
