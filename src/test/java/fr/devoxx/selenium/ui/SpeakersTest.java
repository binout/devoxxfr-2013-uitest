package fr.devoxx.selenium.ui;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class SpeakersTest extends DevoxxFr2013Test {

    @Test
    public void speakers_page_should_display_table() {
        goTo("/#/speakers");

        assertThat(find("table tr", 0).getText()).contains("Name Company Twitter");
    }

    @Test
    public void speakers_page_should_search_xavier_hanin() {
        goTo("/#/speakers");

        find("#inputQuery").text("hanin");
        assertThat(find("table tr", 1).getText()).contains("Xavier Hanin 4SH FRANCE @xavierhanin");
    }

}
