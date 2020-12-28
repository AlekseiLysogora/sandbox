package hw5.runtest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.*;

@Feature("Selenium")
@Story("Homework #5")
@CucumberOptions
        (
                features = {"classpath:hw5/feature"},
                glue = {"hw5/commonlogic/hooks"},
                plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
        )
public class RunCucumberTestNGTest extends AbstractTestNGCucumberTests {
}

