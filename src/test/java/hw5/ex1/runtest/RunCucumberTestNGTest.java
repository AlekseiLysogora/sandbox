package hw5.ex1.runtest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {"classpath:hw5/feature"},
                glue = {"hw5/ex1/hooks"},
                plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
        )
public class RunCucumberTestNGTest extends AbstractTestNGCucumberTests {
}

