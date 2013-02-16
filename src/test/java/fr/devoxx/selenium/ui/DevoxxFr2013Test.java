package fr.devoxx.selenium.ui;

import fr.devoxx.selenium.PhantomJsTest;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DevoxxFr2013Test extends PhantomJsTest {

    @Override
    public String defaultUrl() {
        return "http://binout.github.com/devoxxfr-2013";
    }

    @Test
    public void planning_page_should_display_navbar() {
        goTo("/");

        assertThat(find(".brand").getText()).contains("Devoxxfr 2013");
    }

    @Test
    public void planning_page_should_display_search() {
        goTo("/");

        assertThat(find(".control-label").getText()).contains("Recherche");
    }

    @Test
    public void planning_page_should_display_table() {
        goTo("/");

        assertThat(find("table tr", 0).getText()).contains("Type Track Title Speaker Experience Language");
    }

    @Test
    public void speakers_page_should_display_table() {
        goTo("/speakers.html");

        assertThat(find("table tr", 0).getText()).contains("Name Company Twitter");
    }
}
