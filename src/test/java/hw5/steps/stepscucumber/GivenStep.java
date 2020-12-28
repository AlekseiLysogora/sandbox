package hw5.steps.stepscucumber;

import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    @Given("I open JDI GitHub site")
    public void i_open_jdi_git_hub_site() {
        commonActionStep.openTestSite();
    }

}