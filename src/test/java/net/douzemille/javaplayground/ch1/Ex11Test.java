package net.douzemille.javaplayground.ch1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Ex11Test {
    @Test
    public void classes() {
        assertThat(new Ex11.IaJa().f(), is("IaJa"));
        assertThat(new Ex11.IaJd().f(), is("J_default"));
        assertThat(new Ex11.IaJs().f(), is("J_static"));
        assertThat(new Ex11.IdJa().f(), is("I_default"));
        assertThat(new Ex11.IdJd().f(), is("I_default"));
        assertThat(new Ex11.IdJs().f(), is("I_default"));
        assertThat(new Ex11.IsJa().f(), is("I_static"));
        assertThat(new Ex11.IsJd().f(), is("J_default"));
        // assertThat(new Ex11.IsJs().f(), is("J_static")); // not defined
    }
}
