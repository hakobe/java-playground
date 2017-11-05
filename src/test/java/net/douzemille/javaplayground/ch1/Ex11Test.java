package net.douzemille.javaplayground.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex11Test {
    @Test
    public void classes() {
        assertEquals(new Ex11.IaJa().f(), "IaJa");
        assertEquals(new Ex11.IaJd().f(), "J_default");
        assertEquals(new Ex11.IaJs().f(), "J_static");
        assertEquals(new Ex11.IdJa().f(), "I_default");
        assertEquals(new Ex11.IdJd().f(), "I_default");
        assertEquals(new Ex11.IdJs().f(), "I_default");
        assertEquals(new Ex11.IsJa().f(), "I_static");
        assertEquals(new Ex11.IsJd().f(), "J_default");
        // assertThat(new Ex11.IsJs().f(), is("J_static")); // not defined
    }
}
