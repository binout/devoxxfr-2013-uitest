package fr.devoxx.selenium;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DevoxxFr2013Test extends PhantomJsTest {

    @Override
    public String defaultUrl() {
        return "http://binout.github.com/devoxxfr-2013";
    }

    @Test
    public void should_display_navbar() {
        goTo("/");

        assertThat(find(".brand").getText()).contains("Devoxxfr 2013");
    }
}
