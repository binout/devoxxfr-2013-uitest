package fr.devoxx.selenium.ui;

import org.junit.Ignore;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class SpeakerTest extends DevoxxFr2013Test {

    @Test
    @Ignore("Seems angularjs routeparam is not recognized by driver")
    public void speaker_page_should_display_xhanin_bio() {
        goTo("/#/speakers/924");

        assertThat(find("h1").getText()).contains("Xavier Hanin");
    }
}
