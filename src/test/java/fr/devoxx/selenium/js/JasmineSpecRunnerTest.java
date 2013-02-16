package fr.devoxx.selenium.js;

import fr.devoxx.selenium.PhantomJsTest;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class JasmineSpecRunnerTest extends PhantomJsTest {

    @Override
    public String defaultUrl() {
        return "http://binout.github.com/devoxxfr-2013";
    }

    @Test
    public void specRunner_should_pass() {
        goTo("/spec/SpecRunner.html");

        assertThat(find(".passingAlert").getText()).contains("Passing");
    }

}
