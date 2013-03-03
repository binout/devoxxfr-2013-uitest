package fr.devoxx.selenium.ui;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TalksTest extends DevoxxFr2013Test {

    @Test
    public void talks_page_should_display_navbar() {
        goTo("/#/talks");

        assertThat(find(".brand").getText()).contains("Devoxxfr 2013");
    }

    @Test
    public void talks_page_should_display_search() {
        goTo("/#/talks");

        assertThat(find(".control-label").getText()).contains("Search");
    }

    @Test
    public void talks_page_should_display_table() {
        goTo("/#/talks");

        assertThat(find("table tr", 0).getText()).contains("Type Track Title Speaker Experience Language");
    }

    @Test
    public void talks_page_should_search_xavier_hanin() {
        goTo("/#/talks");

        find("#inputQuery").text("xavier hanin");
        assertThat(find("table tr", 1).getText()).contains("Xavier Hanin");
    }

}
