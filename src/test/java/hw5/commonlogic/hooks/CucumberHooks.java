package hw5.commonlogic.hooks;

import hw5.commonlogic.driver.WebDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void setUp() {
        WebDriverSingleton.getDriver();
    }

    @After
    public void tearDown() {
        WebDriverSingleton.closeDriver();
    }
}

