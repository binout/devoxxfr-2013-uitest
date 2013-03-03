package fr.devoxx.selenium.ui;

import fr.devoxx.selenium.PhantomJsTest;

public abstract class DevoxxFr2013Test extends PhantomJsTest {

    @Override
    public String defaultUrl() {
        return "http://binout.github.com/devoxxfr-2013";
    }
}
