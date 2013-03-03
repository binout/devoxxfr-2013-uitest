package fr.devoxx.selenium.ui;

import org.junit.Ignore;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TalkTest extends DevoxxFr2013Test {

    @Test
    @Ignore("Seems angularjs routeparam is not recognized by driver")
    public void talk_page_should_display_xhanin_talk() {
        goTo("/#/talks/2740");

        assertThat(find("h1").getText()).contains("IDE Java");
    }

}
